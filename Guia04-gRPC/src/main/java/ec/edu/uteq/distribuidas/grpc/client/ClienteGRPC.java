package ec.edu.uteq.distribuidas.grpc.client;

import ec.edu.uteq.distribuidas.grpc.gen.*;
import io.grpc.*;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class ClienteGRPC {

    private static final AtomicLong reloj = new AtomicLong(0);

    public static void main(String[] args) throws Exception {
        ManagedChannel canal = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        ServicioMensajeriaGrpc.ServicioMensajeriaBlockingStub stubBloqueante =
                ServicioMensajeriaGrpc.newBlockingStub(canal);
        ServicioMensajeriaGrpc.ServicioMensajeriaStub stubAsync =
                ServicioMensajeriaGrpc.newStub(canal);

        // -- 1. Llamada unaria -------------------------
        System.out.println("=== 1. Llamada Unaria ===");
        SolicitudMensaje solicitud = SolicitudMensaje.newBuilder()
                .setRemitente("ClienteA")
                .setContenido("Hola desde gRPC")
                .setTimestamp(reloj.incrementAndGet())
                .build();
        RespuestaMensaje resp = stubBloqueante.enviarMensaje(solicitud);
        System.out.println("Respuesta: " + resp.getContenido() + " (ts=" + resp.getTimestamp() + ")");

        // -- 2. Server streaming -----------------------
        System.out.println("\n=== 2. Server Streaming (3 noticias) ===");
        Iterator<RespuestaMensaje> noticias = stubBloqueante.recibirNoticias(
                SolicitudStream.newBuilder()
                        .setUsuario("ClienteA")
                        .setCantidad(3)
                        .build());
        while (noticias.hasNext()) {
            System.out.println("<< " + noticias.next().getContenido());
        }

        // -- 3. Bidireccional -------------------------
        System.out.println("\n=== 3. Chat Bidireccional ===");
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<SolicitudMensaje> emisor =
                stubAsync.chatBidireccional(new StreamObserver<>() {
                    @Override
                    public void onNext(RespuestaMensaje r) {
                        System.out.println("<< " + r.getContenido());
                    }
                    @Override
                    public void onError(Throwable t) {
                        latch.countDown();
                    }
                    @Override
                    public void onCompleted() {
                        System.out.println("Stream completado.");
                        latch.countDown();
                    }
                });

        for (int i = 1; i <= 3; i++) {
            emisor.onNext(SolicitudMensaje.newBuilder()
                    .setRemitente("ClienteA")
                    .setContenido("Mensaje bidireccional #" + i)
                    .setTimestamp(reloj.incrementAndGet())
                    .build());
            Thread.sleep(300);
        }
        emisor.onCompleted();
        latch.await(5, TimeUnit.SECONDS);

        canal.shutdown();
    }
}
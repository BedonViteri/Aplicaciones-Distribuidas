package ec.edu.uteq.distribuidas.grpc.server;

import ec.edu.uteq.distribuidas.grpc.gen.*;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.atomic.AtomicLong;

public class MensajeriaServiceImpl
        extends ServicioMensajeriaGrpc.ServicioMensajeriaImplBase {

    private final AtomicLong relojLamport = new AtomicLong(0);

    // -- 1. Llamada unaria -----------------------------
    @Override
    public void enviarMensaje(SolicitudMensaje request,
                              StreamObserver<RespuestaMensaje> responseObserver) {
        long ts = Math.max(relojLamport.get(), request.getTimestamp()) + 1;
        relojLamport.set(ts);

        System.out.printf("[gRPC Unario] %s: %s (ts=%d)%n",
                request.getRemitente(), request.getContenido(), ts);

        RespuestaMensaje respuesta = RespuestaMensaje.newBuilder()
                .setServidor("ServidorGRPC")
                .setContenido("ACK: " + request.getContenido())
                .setTimestamp(ts)
                .setExito(true)
                .build();

        responseObserver.onNext(respuesta);
        responseObserver.onCompleted();
    }

    // -- 2. Server streaming ---------------------------
    @Override
    public void recibirNoticias(SolicitudStream request,
                                StreamObserver<RespuestaMensaje> responseObserver) {
        String usuario = request.getUsuario();
        int cantidad = request.getCantidad();

        System.out.printf("[gRPC Streaming] Enviando %d noticias a %s%n", cantidad, usuario);

        for (int i = 1; i <= cantidad; i++) {
            long ts = relojLamport.incrementAndGet();
            RespuestaMensaje noticia = RespuestaMensaje.newBuilder()
                    .setServidor("ServidorGRPC")
                    .setContenido("Noticia #" + i + " para " + usuario)
                    .setTimestamp(ts)
                    .setExito(true)
                    .build();
            responseObserver.onNext(noticia);

            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        }
        responseObserver.onCompleted();
    }

    // -- 3. Chat bidireccional -------------------------
    @Override
    public StreamObserver<SolicitudMensaje> chatBidireccional(
            StreamObserver<RespuestaMensaje> responseObserver) {

        return new StreamObserver<>() {
            @Override
            public void onNext(SolicitudMensaje msg) {
                long ts = Math.max(relojLamport.get(), msg.getTimestamp()) + 1;
                relojLamport.set(ts);
                System.out.printf("[gRPC Bidir] %s: %s%n",
                        msg.getRemitente(), msg.getContenido());

                responseObserver.onNext(RespuestaMensaje.newBuilder()
                        .setServidor("ServidorGRPC")
                        .setContenido("[" + msg.getRemitente() + "] " + msg.getContenido())
                        .setTimestamp(ts)
                        .setExito(true)
                        .build());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error en stream: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
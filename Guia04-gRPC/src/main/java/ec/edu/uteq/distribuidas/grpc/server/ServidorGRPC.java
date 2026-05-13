package ec.edu.uteq.distribuidas.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ServidorGRPC {

    private static final int PUERTO = 50051;

    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(PUERTO)
                .addService(new MensajeriaServiceImpl())
                .build()
                .start();

        System.out.println("Servidor gRPC iniciado en puerto " + PUERTO);
        Runtime.getRuntime().addShutdownHook(new Thread(server::shutdown));
        server.awaitTermination();
    }
}
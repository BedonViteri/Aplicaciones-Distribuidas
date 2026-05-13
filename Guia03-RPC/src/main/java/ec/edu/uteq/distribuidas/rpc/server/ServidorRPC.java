package ec.edu.uteq.distribuidas.rpc.server;

import ec.edu.uteq.distribuidas.rpc.gen.Calculadora;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;

public class ServidorRPC {

    private static final int PUERTO = 9090;

    public static void main(String[] args) throws Exception {
        Calculadora.Processor<CalculadoraImpl> processor =
                new Calculadora.Processor<>(new CalculadoraImpl());

        TServerTransport transport = new TServerSocket(PUERTO);

        TThreadPoolServer.Args serverArgs =
                new TThreadPoolServer.Args(transport)
                        .processor(processor)
                        .minWorkerThreads(5)
                        .maxWorkerThreads(20);

        TServer server = new TThreadPoolServer(serverArgs);
        System.out.println("Servidor Thrift (RPC) escuchando en puerto: " + PUERTO);
        server.serve();
    }
}
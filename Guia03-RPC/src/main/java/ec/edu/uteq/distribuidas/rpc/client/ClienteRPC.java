package ec.edu.uteq.distribuidas.rpc.client;

import ec.edu.uteq.distribuidas.rpc.gen.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.transport.*;

public class ClienteRPC {

    private static final String HOST = "localhost";
    private static final int PUERTO = 9090;

    public static void main(String[] args) throws Exception {
        try (TTransport transport = new TSocket(HOST, PUERTO)) {
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            Calculadora.Client cliente = new Calculadora.Client(protocol);

            System.out.println("Conectado al servidor: " + cliente.nombreServidor());
            System.out.printf("5 + 3  = %.2f%n", cliente.sumar(5, 3));
            System.out.printf("10 - 4 = %.2f%n", cliente.restar(10, 4));
            System.out.printf("6 x 7  = %.2f%n", cliente.multiplicar(6, 7));
            System.out.printf("15 / 4 = %.4f%n", cliente.dividir(15, 4));

            try {
                cliente.dividir(10, 0);
            } catch (OperacionInvalidaException ex) {
                System.out.println("Excepcion capturada: " + ex.getMessage());
            }
        }
    }
}
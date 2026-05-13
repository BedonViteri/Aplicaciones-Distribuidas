package ec.edu.uteq.distribuidas.rpc.server;

import ec.edu.uteq.distribuidas.rpc.gen.Calculadora;
import ec.edu.uteq.distribuidas.rpc.gen.OperacionInvalidaException;
import org.apache.thrift.TException;

public class CalculadoraImpl implements Calculadora.Iface {

    @Override
    public double sumar(double a, double b) throws TException {
        System.out.printf("RPC sumar(%.2f, %.2f)%n", a, b);
        return a + b;
    }

    @Override
    public double restar(double a, double b) throws TException {
        System.out.printf("RPC restar(%.2f, %.2f)%n", a, b);
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) throws TException {
        System.out.printf("RPC multiplicar(%.2f, %.2f)%n", a, b);
        return a * b;
    }

    @Override
    public double dividir(double a, double b)
            throws OperacionInvalidaException, TException {
        System.out.printf("RPC dividir(%.2f, %.2f)%n", a, b);
        if (b == 0.0) {
            throw new OperacionInvalidaException("Division por cero no permitida");
        }
        return a / b;
    }

    @Override
    public String nombreServidor() throws TException {
        try {
            return "ServidorThrift@" + java.net.InetAddress.getLocalHost().getHostName();
        } catch (java.net.UnknownHostException e) {
            return "ServidorThrift@localhost";
        }
    }
}

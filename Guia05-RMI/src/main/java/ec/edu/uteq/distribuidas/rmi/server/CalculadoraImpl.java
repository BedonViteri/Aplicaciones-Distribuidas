package ec.edu.uteq.distribuidas.rmi.server;

import ec.edu.uteq.distribuidas.rmi.api.CalculadoraRemota;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Implementacion concreta del objeto remoto.
 * OBLIGATORIO: extender UnicastRemoteObject.
 */
public class CalculadoraImpl
        extends UnicastRemoteObject
        implements CalculadoraRemota {

    private static final long serialVersionUID = 1L;
    private final String nombreServidor;

    public CalculadoraImpl(String nombre) throws RemoteException {
        super();
        this.nombreServidor = nombre;
    }

    @Override
    public double sumar(double a, double b) throws RemoteException {
        logLlamada("sumar", a, b);
        return a + b;
    }

    @Override
    public double restar(double a, double b) throws RemoteException {
        logLlamada("restar", a, b);
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) throws RemoteException {
        logLlamada("multiplicar", a, b);
        return a * b;
    }

    @Override
    public double dividir(double a, double b) throws RemoteException {
        logLlamada("dividir", a, b);
        if (b == 0.0) {
            throw new RemoteException("Division por cero no permitida");
        }
        return a / b;
    }

    @Override
    public double potencia(double base, double exp) throws RemoteException {
        return Math.pow(base, exp);
    }

    @Override
    public double raizCuadrada(double n) throws RemoteException {
        if (n < 0) throw new RemoteException("Raiz de negativo no definida en R");
        return Math.sqrt(n);
    }

    @Override
    public String obtenerInfo() throws RemoteException {
        return "Servidor RMI: " + nombreServidor
                + " | JVM: " + System.getProperty("java.version")
                + " | Hilos activos: " + Thread.activeCount();
    }

    private void logLlamada(String metodo, double a, double b) {
        System.out.printf("[RMI] %s(%.2f, %.2f) invocado%n", metodo, a, b);
    }
}
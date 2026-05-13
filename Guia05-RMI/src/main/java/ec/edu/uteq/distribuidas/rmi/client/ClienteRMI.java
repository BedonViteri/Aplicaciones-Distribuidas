package ec.edu.uteq.distribuidas.rmi.client;

import ec.edu.uteq.distribuidas.rmi.api.CalculadoraRemota;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Cliente RMI.
 * IMPORTANTE: El cliente SOLO necesita la interfaz CalculadoraRemota.java.
 * NO necesita la implementacion CalculadoraImpl.java.
 * Esta es la "transparencia de acceso" de RMI.
 *
 * Para simular dos JVMs en equipos distintos:
 * cambiar HOST a la IP del servidor (ej: "192.168.1.100").
 * El cliente solo necesita CalculadoraRemota.java en su classpath.
 */
public class ClienteRMI {

    private static final String HOST = "localhost"; // Cambiar por IP del servidor si es remoto
    private static final int PUERTO = 1099;
    private static final String NOMBRE = "CalculadoraDistribuida";

    public static void main(String[] args) {
        String url = "rmi://" + HOST + ":" + PUERTO + "/" + NOMBRE;

        try {
            // lookup() devuelve un stub (proxy) que parece un objeto local
            CalculadoraRemota calc = (CalculadoraRemota) Naming.lookup(url);

            System.out.println("Conectado a: " + calc.obtenerInfo());
            System.out.println("-----------------------------------");

            // Todas estas llamadas viajan por la red transparentemente
            System.out.printf("10 + 5  = %.2f%n", calc.sumar(10, 5));
            System.out.printf("10 - 5  = %.2f%n", calc.restar(10, 5));
            System.out.printf("10 x 5  = %.2f%n", calc.multiplicar(10, 5));
            System.out.printf("10 / 4  = %.4f%n", calc.dividir(10, 4));
            System.out.printf("2 ^ 10  = %.0f%n", calc.potencia(2, 10));
            System.out.printf("sqrt(2) = %.6f%n", calc.raizCuadrada(2));

            // Prueba de excepcion remota
            try {
                calc.dividir(5, 0);
            } catch (RemoteException e) {
                System.out.println("Excepcion remota: " + e.getMessage());
            }

        } catch (Exception e) {
            System.err.println("Error en ClienteRMI: " + e.getMessage());
        }
    }
}
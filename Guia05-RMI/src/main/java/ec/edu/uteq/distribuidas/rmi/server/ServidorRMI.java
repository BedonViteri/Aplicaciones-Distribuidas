package ec.edu.uteq.distribuidas.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Servidor RMI:
 * 1. Crea el RMI Registry en el puerto 1099.
 * 2. Instancia el objeto remoto (lo exporta automaticamente).
 * 3. Lo registra en el Registry con un nombre.
 */
public class ServidorRMI {

    private static final int PUERTO_REGISTRY = 1099;
    private static final String NOMBRE = "CalculadoraDistribuida";

    public static void main(String[] args) {
        try {
            // Paso 1: Crear el registry en este proceso
            LocateRegistry.createRegistry(PUERTO_REGISTRY);
            System.out.println("RMI Registry creado en puerto " + PUERTO_REGISTRY);

            // Paso 2: Instanciar la implementacion
            CalculadoraImpl calculadora = new CalculadoraImpl("UTEQ-Servidor-01");

            // Paso 3: Registrar con el nombre buscable por clientes
            String url = "rmi://localhost:" + PUERTO_REGISTRY + "/" + NOMBRE;
            Naming.bind(url, calculadora);

            System.out.println("Objeto registrado en: " + url);
            System.out.println("Servidor RMI listo. Esperando clientes...");
            System.out.println(calculadora.obtenerInfo());

            // Mantener el servidor vivo
            Thread.currentThread().join();

        } catch (Exception e) {
            System.err.println("Error en ServidorRMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
package ec.edu.uteq.distribuidas.rmi.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interfaz remota RMI.
 * REGLAS OBLIGATORIAS para interfaces RMI:
 * 1. Debe extender java.rmi.Remote.
 * 2. Cada metodo DEBE declarar throws RemoteException.
 * 3. Los parametros y el valor de retorno deben ser:
 *    - Tipos primitivos, o
 *    - Implementar java.io.Serializable, o
 *    - Implementar Remote (objetos remotos anidados).
 */
public interface CalculadoraRemota extends Remote {

    double sumar(double a, double b) throws RemoteException;
    double restar(double a, double b) throws RemoteException;
    double multiplicar(double a, double b) throws RemoteException;
    double dividir(double a, double b) throws RemoteException;
    String obtenerInfo() throws RemoteException;

    // Metodos adicionales
    double potencia(double base, double exponente) throws RemoteException;
    double raizCuadrada(double n) throws RemoteException;
}
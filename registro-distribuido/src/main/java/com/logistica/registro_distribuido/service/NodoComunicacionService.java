package com.logistica.registro_distribuido.service;

import org.springframework.stereotype.Service;
import java.io.DataOutputStream;
import java.net.Socket;

@Service
public class NodoComunicacionService {

    public void enviarMensaje(String host, int puerto, String mensaje) {
        try (Socket socket = new Socket(host, puerto)) {
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            byte[] data = mensaje.getBytes();
            out.writeInt(data.length);
            out.write(data);
        } catch (Exception e) {
            System.err.println("Error enviando mensaje a " + host + ":" + puerto);
        }
    }
}
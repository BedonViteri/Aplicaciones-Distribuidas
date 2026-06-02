package com.logistica.registro_distribuido.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BullyElectionService {

    private final NodoComunicacionService comunicacion;
    private final int myId = 1;
    private boolean enEleccion = false;
    public BullyElectionService(NodoComunicacionService comunicacion) {
        this.comunicacion = comunicacion;
    }
    public void iniciarEleccion() {
        if (enEleccion) return;
        enEleccion = true;
        System.out.println("Nodo " + myId + ": Coordinador caído, iniciando elección...");
        boolean hayMasGrande = false;
        if (!hayMasGrande) {
            proclamarLider();
        }
    }
    public void proclamarLider() {
        System.out.println("Nodo " + myId + ": Soy el nuevo coordinador.");
        enEleccion = false;
    }
}
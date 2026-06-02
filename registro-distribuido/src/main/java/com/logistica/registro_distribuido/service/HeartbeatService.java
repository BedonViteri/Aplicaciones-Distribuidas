package com.logistica.registro_distribuido.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HeartbeatService {

    private final NodoComunicacionService comunicacionService;
    private final BullyElectionService bullyElectionService;
    private final List<Integer> otrosNodos = List.of(8082, 8083);
    public HeartbeatService(NodoComunicacionService comunicacionService, BullyElectionService bullyElectionService) {
        this.comunicacionService = comunicacionService;
        this.bullyElectionService = bullyElectionService;
    }

    @Scheduled(fixedRate = 2000)
    public void enviarLatidos() {
        for (int puerto : otrosNodos) {
            try {
                comunicacionService.enviarMensaje("localhost", puerto, "HEARTBEAT");
            } catch (Exception e) {
                System.out.println("Nodo en puerto " + puerto + " caído. Disparando elección...");
                bullyElectionService.iniciarEleccion();
            }
        }
    }
}
package com.logistica.registro_distribuido.service;

import java.util.concurrent.atomic.AtomicLong;

public class LamporkClock {

    private final AtomicLong reloj = new AtomicLong(0);

    public long incrementar() {
        return reloj.incrementAndGet();
    }

    public long actualizar(long recibido) {
        long actual = reloj.get();
        long nuevo = Math.max(actual, recibido) + 1;
        reloj.set(nuevo);
        return nuevo;
    }

    public long getValor() {
        return reloj.get();
    }

}

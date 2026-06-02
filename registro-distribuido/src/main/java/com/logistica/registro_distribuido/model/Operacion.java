package com.logistica.registro_distribuido.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Operacion {
    private String id;
    private String descripcion;
    private long timestamp;
    private String nodoOrigen;
}

package com.logistica.registro_distribuido.controller;

import com.logistica.registro_distribuido.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/operaciones")
public class OperacionController {

    @Autowired
    private AuthService authService;

    @PostMapping
    public ResponseEntity<String> registrarOperacion(
            @RequestHeader("Authorization") String token,
            @RequestBody String operacion) {

        if (!authService.validarToken(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Acceso denegado: Token inválido o ausente.");
        }
        return ResponseEntity.ok("Operación registrada correctamente.");
    }
}
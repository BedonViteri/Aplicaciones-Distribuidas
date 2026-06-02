package com.logistica.registro_distribuido.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private static final String TOKEN_VALIDO = "token-secreto-123";

    public boolean validarToken(String token) {
        if (token == null || token.isBlank()) {
            return false;
        }
        return token.equals("Bearer " + TOKEN_VALIDO);
    }
}

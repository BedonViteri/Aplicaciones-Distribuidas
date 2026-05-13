package WebSockets.demo.controller;

import WebSockets.demo.model.MensajeChat;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private final SimpMessageSendingOperations messagingTemplate;

    public ChatController(SimpMessageSendingOperations messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/chat.enviar")
    @SendTo("/topic/sala-general")
    public MensajeChat enviarMensaje(MensajeChat mensaje) {
        System.out.println("[WS] " + mensaje.usuario() + ": " + mensaje.contenido());
        return mensaje;
    }

    @MessageMapping("/chat.unirse")
    @SendTo("/topic/sala-general")
    public MensajeChat unirse(MensajeChat mensaje,
                              @Header("simpSessionId") String sessionId) {
        System.out.println("[WS] Usuario '" + mensaje.usuario() + "' entró. SessionId: " + sessionId);
        return new MensajeChat(mensaje.usuario(),
                               mensaje.usuario() + " se unió a la sala.",
                               "UNIRSE", null);
    }
}
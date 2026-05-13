package WebSockets.demo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public record MensajeChat(
    String usuario,
    String contenido,
    String tipo,
    String timestamp
) {
    public MensajeChat {
        if (timestamp == null) {
            timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
    }
}
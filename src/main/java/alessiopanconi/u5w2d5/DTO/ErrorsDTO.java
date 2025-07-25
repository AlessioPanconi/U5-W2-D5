package alessiopanconi.u5w2d5.DTO;

import java.time.LocalDateTime;

public record ErrorsDTO(
        String message,
        LocalDateTime timestamp)
{}

package alessiopanconi.u5w2d5.DTO;

import jakarta.validation.constraints.NotEmpty;

public record PatchViaggioDTO(
        @NotEmpty(message =  "Lo stato è obbligatorio")
                              String stato
)
{}

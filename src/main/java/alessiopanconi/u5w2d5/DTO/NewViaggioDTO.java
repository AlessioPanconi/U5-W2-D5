package alessiopanconi.u5w2d5.DTO;

import jakarta.validation.constraints.NotEmpty;

public record NewViaggioDTO(

        @NotEmpty(message =  "La destinazione è obbligatorio")
        String destinazione,
        @NotEmpty(message =  "La data è obbligatorio")
        String data
) {}

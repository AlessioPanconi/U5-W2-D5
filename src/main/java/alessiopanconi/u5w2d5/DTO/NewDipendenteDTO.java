package alessiopanconi.u5w2d5.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record NewDipendenteDTO(

        @NotEmpty(message =  "L'username è obbligatorio")
        String username,
        @NotEmpty(message =  "Il nome è obbligatorio")
        String nome,
        @NotEmpty(message =  "Il cognome è obbligatorio")
        String cognome,
        @NotEmpty(message = "L'indirizzo email è obbligatorio")
        @Email(message = "L'indirizzo email inserito non è nel formato giusto")
        String email
) {}

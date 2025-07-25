package alessiopanconi.u5w2d5.entities;

import alessiopanconi.u5w2d5.enums.Stato;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "viaggio")
@Getter
@Setter
@NoArgsConstructor
public class Viaggio {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private long idViaggio;
    private String destinazione;
    private LocalDate data;
    private Stato stato;

    public Viaggio(String destinazione, LocalDate data, Stato stato) {
        this.destinazione = destinazione;
        this.data = data;
        this.stato = stato;
    }
    @Override
    public String toString() {
        return "Viaggio{" +
                "idPrenotazione=" + idViaggio +
                ", destinazione='" + destinazione + '\'' +
                ", data=" + data +
                ", stato=" + stato +
                '}';
    }
}

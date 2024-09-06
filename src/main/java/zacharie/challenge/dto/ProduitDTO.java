package zacharie.challenge.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;
import lombok.NonNull;
import zacharie.challenge.model.Categorie;
import zacharie.challenge.model.Statut;

import java.time.LocalDate;

@Data
public class ProduitDTO {
    private Long id;
    @NonNull
    private String code;
    @NonNull
    private String nom;
    @NonNull
    private String description;
    @NonNull
    private String image;
    @NonNull
    private Double prix_vente;
    @NonNull
    @PastOrPresent(message = "La date d'ajout ne doit pas être dans le future !")
    private LocalDate date_ajout;
    @NonNull
    private Double prix_ajout;
    @NonNull
    private Statut statut;

}

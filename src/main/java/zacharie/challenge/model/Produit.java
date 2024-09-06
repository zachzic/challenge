package zacharie.challenge.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String nom;
    private String description;
    private String image;
    private Double prix_vente;
    private LocalDate date_ajout;
    private Double prix_ajout;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Statut statut;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
}

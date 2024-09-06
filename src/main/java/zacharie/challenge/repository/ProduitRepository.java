package zacharie.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zacharie.challenge.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}

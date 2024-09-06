package zacharie.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zacharie.challenge.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}

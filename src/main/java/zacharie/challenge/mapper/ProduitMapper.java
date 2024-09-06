package zacharie.challenge.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import zacharie.challenge.dto.ProduitDTO;
import zacharie.challenge.model.Produit;

@Mapper
public interface ProduitMapper {
    ProduitMapper INSTANCE = Mappers.getMapper(ProduitMapper.class);

    ProduitDTO ProduitToProduitDTO(Produit produit);

    Produit ProduitDTOToProduit(Produit produit);
}

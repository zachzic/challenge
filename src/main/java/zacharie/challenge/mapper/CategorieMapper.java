package zacharie.challenge.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import zacharie.challenge.dto.CategorieDTO;
import zacharie.challenge.model.Categorie;

@Mapper
public interface CategorieMapper {
    CategorieMapper INSTANCE= Mappers.getMapper(CategorieMapper.class);

    CategorieDTO CategorieToCategorieDTO(Categorie categorie);

    Categorie CategorieDTOToCategorie(CategorieDTO categorieDTO);
}

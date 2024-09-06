package zacharie.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zacharie.challenge.dto.CategorieDTO;
import zacharie.challenge.mapper.CategorieMapper;
import zacharie.challenge.model.Categorie;
import zacharie.challenge.repository.CategorieRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategorieService {
    @Autowired
    private static CategorieRepository  categorieRepository;

    public CategorieDTO createCategorie(CategorieDTO categorieDTO) {
        Categorie categorie= CategorieMapper.INSTANCE.CategorieDTOToCategorie(categorieDTO);
        categorie = categorieRepository.save(categorie);
        return CategorieMapper.INSTANCE.CategorieToCategorieDTO(categorie);
    }

    public List<CategorieDTO> getAllCategories() {
        return categorieRepository.findAll().stream()
                .map(CategorieMapper.INSTANCE::CategorieToCategorieDTO)
                .collect(Collectors.toList());
    }

    public CategorieDTO getCategorie(long id) {
        Categorie categorie = categorieRepository.findById(id).orElseThrow(()-> new RuntimeException("Categorie not found"));
        return CategorieMapper.INSTANCE.CategorieToCategorieDTO(categorie);
    }

//    public CategorieDTO getCategorieByCode(String code) {
//        Categorie categorie = categorieRepository.findByCode(code).orElseThrow(()-> new RuntimeException("Categorie not found"));
//        return CategorieMapper.INSTANCE.CategorieToCategorieDTO(categorie);
//    }

    public CategorieDTO updateCategorie(Long id, CategorieDTO categorieDTO) {
        Categorie categorie = categorieRepository.findById(id).orElseThrow(()-> new RuntimeException("Categorie not found"));

    }
}

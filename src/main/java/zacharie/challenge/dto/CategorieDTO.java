package zacharie.challenge.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class CategorieDTO {
    private Long id;
    @NonNull
    private String code;
    @NonNull
    private String nom;
}

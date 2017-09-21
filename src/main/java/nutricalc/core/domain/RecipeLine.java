package nutricalc.core.domain;

import lombok.Data;

@Data
public class RecipeLine {
    private Long id;
    private Long recipeId;
    private Long specificationId;
}

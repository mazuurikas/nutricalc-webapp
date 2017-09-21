package nutricalc.core.domain;

import lombok.Data;

@Data
public class Recipe {
    private Long id;
    private Long productId;
    private String description;
}

package nutricalc.rest.resources;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class SpecificationListResource extends ResourceSupport {
    private List<SpecificationResource> specifications = new ArrayList<>();
}

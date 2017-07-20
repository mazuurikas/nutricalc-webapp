package nutricalc.core.services.util;

import nutricalc.core.models.entities.Specification;

import java.util.ArrayList;
import java.util.List;

public class SpecificationList {
    private List<Specification> specifications = new ArrayList<>();

    public SpecificationList(List<Specification> resultList){
        this.specifications = resultList;
    }

    public List<Specification> getSpecifications(){
        return specifications;
    }

    public void setSpecifications(List<Specification> specifications){
        this.specifications = specifications;
    }
}

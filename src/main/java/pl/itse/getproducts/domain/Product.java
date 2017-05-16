package pl.itse.getproducts.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

/**
 * Created by Borys on 2017-04-13.
 */
@Entity
public class Product extends BaseEntity {

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static enum ProductType {
        EQUIPMENT, FOOD
    }

    @Enumerated(EnumType.STRING)
    private ProductType type;

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    protected Product(){}

    public Product(String name, ProductType type) {
        this.name = name;
        this.type = type;
    }
}

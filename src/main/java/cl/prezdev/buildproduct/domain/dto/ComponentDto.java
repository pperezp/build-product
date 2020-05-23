package cl.prezdev.buildproduct.domain.dto;

import cl.prezdev.buildproduct.domain.model.Component;
import lombok.Data;

@Data
public class ComponentDto {
    private Integer id;
    private String name;
    private String description;
    private Float price;
    private Boolean base;
    private Integer quantity;

    public ComponentDto(Component component, Integer quantity) {
        this.id = component.getId();
        this.name = component.getName();
        this.description = component.getDescription();
        this.price = component.getPrice();
        this.base = component.getBase();
        this.quantity = quantity;
    }
}
package cl.prezdev.buildproduct.domain.dto;

import cl.prezdev.buildproduct.domain.model.Pack;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PackDto {
    private Integer id;
    private String name;
    private String description;
    private List<ComponentDto> components;

    public PackDto(Pack pack) {
        this.id = pack.getId();
        this.name = pack.getName();
        this.description = pack.getDescription();
        this.components = new ArrayList<>();
    }

    public void addComponent(ComponentDto componentDto) {
        this.components.add(componentDto);
    }
}
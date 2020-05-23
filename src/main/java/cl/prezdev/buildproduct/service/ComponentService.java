package cl.prezdev.buildproduct.service;


import cl.prezdev.buildproduct.domain.model.Component;
import cl.prezdev.buildproduct.domain.model.Pack;

import java.util.List;

public interface ComponentService {
    Integer getQuantity(Pack pack, Component component);

    Component create(Component component);

    List<Component> getComponents(Boolean base);

    List<Component> getComponents();
}

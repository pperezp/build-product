package cl.prezdev.buildproduct.service;


import cl.prezdev.buildproduct.domain.model.Component;
import cl.prezdev.buildproduct.domain.model.Pack;

public interface ComponentService {
    Integer getQuantity(Pack pack, Component component);
}

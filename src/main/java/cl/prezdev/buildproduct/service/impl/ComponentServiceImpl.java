package cl.prezdev.buildproduct.service.impl;

import cl.prezdev.buildproduct.domain.model.Component;
import cl.prezdev.buildproduct.domain.model.Pack;
import cl.prezdev.buildproduct.repository.ComponentRepository;
import cl.prezdev.buildproduct.repository.PackComponentRepository;
import cl.prezdev.buildproduct.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentServiceImpl implements ComponentService {
    @Autowired
    private PackComponentRepository packComponentRepository;

    @Autowired
    private ComponentRepository componentRepository;

    @Override
    public Integer getQuantity(Pack pack, Component component) {
        return packComponentRepository.findByPackAndComponent(pack, component).getQuantity();
    }

    @Override
    public Component create(Component component) {
        return componentRepository.save(component);
    }

    @Override
    public List<Component> getComponents(Boolean base) {
        return componentRepository.findAllByBase(base);
    }

    @Override
    public List<Component> getComponents() {
        return componentRepository.findAll();
    }
}

package cl.prezdev.buildproduct.service.impl;

import cl.prezdev.buildproduct.domain.model.Component;
import cl.prezdev.buildproduct.domain.model.Pack;
import cl.prezdev.buildproduct.repository.PackComponentRepository;
import cl.prezdev.buildproduct.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponentServiceImpl implements ComponentService {
    @Autowired
    private PackComponentRepository packComponentRepository;

    @Override
    public Integer getQuantity(Pack pack, Component component) {
        return packComponentRepository.findByPackAndComponent(pack, component).getQuantity();
    }
}

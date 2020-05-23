package cl.prezdev.buildproduct.service.impl;

import cl.prezdev.buildproduct.domain.model.Component;
import cl.prezdev.buildproduct.domain.model.Pack;
import cl.prezdev.buildproduct.domain.dto.ComponentDto;
import cl.prezdev.buildproduct.domain.dto.PackDto;
import cl.prezdev.buildproduct.repository.PackRepository;
import cl.prezdev.buildproduct.service.ComponentService;
import cl.prezdev.buildproduct.service.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PackServiceImpl implements PackService {
    @Autowired
    private PackRepository packRepository;

    @Autowired
    private ComponentService componentService;

    @Override
    public List<PackDto> findAllPacks() {
        List<PackDto> packsDto = new ArrayList<>();
        List<Pack> allPacks = packRepository.findAll();

        for(Pack pack : allPacks){
            PackDto packDto = new PackDto(pack);
            List<Component> components = pack.getComponents();

            for(Component component : components){
                Integer quantity = componentService.getQuantity(pack, component);
                ComponentDto componentDto = new ComponentDto(component, quantity);
                packDto.addComponent(componentDto);
            }

            packsDto.add(packDto);
        }

        return packsDto;
    }
}

package cl.prezdev.buildproduct.repository;

import cl.prezdev.buildproduct.domain.model.Component;
import cl.prezdev.buildproduct.domain.model.Pack;
import cl.prezdev.buildproduct.domain.model.PackComponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackComponentRepository extends JpaRepository<PackComponent, Integer>{
    PackComponent findByPackAndComponent(Pack pack, Component component);
}
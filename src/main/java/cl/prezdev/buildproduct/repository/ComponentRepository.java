package cl.prezdev.buildproduct.repository;

import cl.prezdev.buildproduct.domain.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComponentRepository extends JpaRepository<Component, Integer> {
    List<Component> findAllByBase(Boolean base);
}

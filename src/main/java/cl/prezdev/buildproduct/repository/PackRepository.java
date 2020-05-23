package cl.prezdev.buildproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.prezdev.buildproduct.domain.model.Pack;

public interface PackRepository extends JpaRepository<Pack, Integer>{
    
}
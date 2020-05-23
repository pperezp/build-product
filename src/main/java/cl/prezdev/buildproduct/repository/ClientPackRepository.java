package cl.prezdev.buildproduct.repository;

import cl.prezdev.buildproduct.domain.model.ClientPack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientPackRepository extends JpaRepository<ClientPack, Integer> {
}

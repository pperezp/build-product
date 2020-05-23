package cl.prezdev.buildproduct.repository;

import cl.prezdev.buildproduct.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}

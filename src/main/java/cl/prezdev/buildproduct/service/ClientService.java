package cl.prezdev.buildproduct.service;

import cl.prezdev.buildproduct.domain.model.Client;

public interface ClientService {
    Client create(Client client);

    Client getClient(Integer id);
}

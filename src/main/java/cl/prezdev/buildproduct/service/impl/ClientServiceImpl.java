package cl.prezdev.buildproduct.service.impl;

import cl.prezdev.buildproduct.domain.model.Client;
import cl.prezdev.buildproduct.repository.ClientRepository;
import cl.prezdev.buildproduct.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClient(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }
}

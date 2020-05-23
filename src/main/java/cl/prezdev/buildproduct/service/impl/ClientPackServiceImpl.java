package cl.prezdev.buildproduct.service.impl;

import cl.prezdev.buildproduct.domain.model.Client;
import cl.prezdev.buildproduct.domain.model.ClientPack;
import cl.prezdev.buildproduct.domain.model.Pack;
import cl.prezdev.buildproduct.repository.ClientPackRepository;
import cl.prezdev.buildproduct.service.ClientPackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientPackServiceImpl implements ClientPackService {
    @Autowired
    private ClientPackRepository clientPackRepository;

    @Override
    public ClientPack create(Client client, Pack pack) {
        ClientPack clientPack = new ClientPack();

        clientPack.setClient(client);
        clientPack.setPack(pack);

        return clientPackRepository.save(clientPack);
    }
}

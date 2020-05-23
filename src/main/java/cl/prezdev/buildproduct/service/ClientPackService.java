package cl.prezdev.buildproduct.service;

import cl.prezdev.buildproduct.domain.model.Client;
import cl.prezdev.buildproduct.domain.model.ClientPack;
import cl.prezdev.buildproduct.domain.model.Pack;

public interface ClientPackService {
    ClientPack create(Client client, Pack pack);
}

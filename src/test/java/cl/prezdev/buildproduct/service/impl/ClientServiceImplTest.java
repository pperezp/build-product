package cl.prezdev.buildproduct.service.impl;

import cl.prezdev.buildproduct.domain.model.Client;
import cl.prezdev.buildproduct.service.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ClientServiceImplTest {
    @Autowired
    private ClientService clientService;

    @Test
    void create() {
        Client client = new Client();

        client.setMail("pperez@gmail.com");
        client.setName("Patricio Pérez");
        client.setPhoneNumber("+569 1234 5678");

        Client result = clientService.create(client);
        assertNotNull(result);
    }

    @Test
    void getClient() {
    }
}
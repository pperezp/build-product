package cl.prezdev.buildproduct.service.impl;

import cl.prezdev.buildproduct.ConfigBeans;
import cl.prezdev.buildproduct.domain.model.Client;
import cl.prezdev.buildproduct.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@RunWith(SpringRunner.class)
@Import(ConfigBeans.class)
@DataJpaTest
@Slf4j
class ClientServiceImplTest {

    @Autowired
    private ClientService clientService;

    @Test
    void create() {
        assertNotNull(createClient());
    }

    @Test
    void getClient() {
        Client client = clientService.getClient(createClient().getId());

        log.info(client.toString());

        assertNotNull(client);
    }

    private Client createClient() {
        Client client = new Client();

        client.setMail("pperez@gmail.com");
        client.setName("Patricio Pérez");
        client.setPhoneNumber("+569 1234 5678");

        return clientService.create(client);
    }
}
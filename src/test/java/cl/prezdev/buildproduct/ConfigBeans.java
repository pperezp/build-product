package cl.prezdev.buildproduct;

import cl.prezdev.buildproduct.service.ClientService;
import cl.prezdev.buildproduct.service.impl.ClientServiceImpl;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@TestConfiguration
public class ConfigBeans {
    @Bean
    public ClientService clientService() {
        return new ClientServiceImpl();
    }

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();

        String testDatabaseName = "buildProduct";

        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://localhost/"+testDatabaseName+"?useSSL=false&serverTimezone=UTC");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("123456");
        
        return dataSourceBuilder.build();
    }
}

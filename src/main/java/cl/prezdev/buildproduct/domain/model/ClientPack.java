package cl.prezdev.buildproduct.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "client_pack")
public class ClientPack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "pack_id", referencedColumnName = "id")
    private Pack Pack;
}
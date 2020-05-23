package cl.prezdev.buildproduct.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pack_component")
public class PackComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "pack_id", referencedColumnName = "id")
    private Pack pack;

    @ManyToOne
    @JoinColumn(name = "component_id", referencedColumnName = "id")
    private Component component;

    private Integer quantity;
}
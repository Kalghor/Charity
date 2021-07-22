package pl.coderslab.charity.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "institution")
@Data
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}

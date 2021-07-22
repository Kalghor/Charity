package pl.coderslab.charity.domain.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "donation")
@Data
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @OneToMany
    @ToString.Exclude
    private List<Category> categories;

    @ManyToOne
    @ToString.Exclude
    private Institution institution;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "pickUpDate")
    private LocalDate pickUpDate;

    @Column(name = "pickUpTime")
    private LocalTime pickUpTime;

    @Column(name = "pickUpComment")
    private String pickUpComment;

}

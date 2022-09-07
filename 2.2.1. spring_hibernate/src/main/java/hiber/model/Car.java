package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "users_cars")
public class Car {

    @Id
    @OneToOne(mappedBy = "userCar")
    private long id;

    @Column(nullable = true)
    private String model;

    @Column
    private int series;

    public Car() {
    }
}

package kg.aleksandrov.megafood.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phone;

    private String pin;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courses_id")
    private Course courseId;
}

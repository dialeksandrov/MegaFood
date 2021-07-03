package kg.aleksandrov.megafood.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String mentor;

    private String assistant;

    private String classroom;

    private Long price;

    private Date startDate;

    private Date endDate;

    private String time;
}

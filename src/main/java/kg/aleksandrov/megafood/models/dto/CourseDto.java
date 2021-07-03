package kg.aleksandrov.megafood.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CourseDto {

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

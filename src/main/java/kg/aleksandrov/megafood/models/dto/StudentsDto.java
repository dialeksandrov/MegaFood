package kg.aleksandrov.megafood.models.dto;

import kg.aleksandrov.megafood.models.entity.Course;
import lombok.Data;

@Data
public class StudentsDto {

    private Long id;

    private String name;

    private String phone;

    private String pin;

    private Course courseId;
}

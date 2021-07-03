package kg.aleksandrov.megafood.models.dto;

import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String phone;

    private String pin;

    private Boolean isActive;
}

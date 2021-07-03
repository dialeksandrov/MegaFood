package kg.aleksandrov.megafood.service;

import kg.aleksandrov.megafood.models.dto.UserDto;
import kg.aleksandrov.megafood.models.entity.User;

public interface UserService {

    UserDto saveUser(UserDto userDto);
}

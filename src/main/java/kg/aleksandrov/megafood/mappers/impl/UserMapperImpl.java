package kg.aleksandrov.megafood.mappers.impl;

import kg.aleksandrov.megafood.mappers.UserMapper;
import kg.aleksandrov.megafood.models.dto.UserDto;
import kg.aleksandrov.megafood.models.entity.User;

public class UserMapperImpl implements UserMapper {
    @Override
    public User toUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setPhone(userDto.getPhone());
        user.setIsActive(userDto.getIsActive());
        user.setPin(userDto.getPin());
        return user;
    }

    @Override
    public UserDto toUserDto(User user) {
        return null;
    }
}

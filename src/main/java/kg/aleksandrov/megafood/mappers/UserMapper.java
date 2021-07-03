package kg.aleksandrov.megafood.mappers;

import kg.aleksandrov.megafood.models.dto.UserDto;
import kg.aleksandrov.megafood.models.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toUser(UserDto userDto);

    UserDto toUserDto(User user);
}

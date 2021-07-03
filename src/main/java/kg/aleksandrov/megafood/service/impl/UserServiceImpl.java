package kg.aleksandrov.megafood.service.impl;

import kg.aleksandrov.megafood.dao.UserRepo;
import kg.aleksandrov.megafood.mappers.UserMapper;
import kg.aleksandrov.megafood.models.dto.PinDto;
import kg.aleksandrov.megafood.models.dto.UserDto;
import kg.aleksandrov.megafood.models.entity.User;
import kg.aleksandrov.megafood.service.PinService;
import kg.aleksandrov.megafood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PinService pinService;


    private UserMapper userMapper = UserMapper.INSTANCE;

    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = userMapper.toUser(userDto);
        String userDtoPhone = userDto.getPhone();
        String pin = userDtoPhone.substring(6,12);
        PinDto pinDto = new PinDto();
        pinDto.setPin(pin.trim());
        pinDto = pinService.savePin(pinDto);
        userDto.setPin(pinDto.getPin());
        user.setPin(userDto.getPin());
        user = userRepo.save(user);
        return userMapper.toUserDto(user);
    }
}

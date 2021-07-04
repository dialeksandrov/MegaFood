package kg.aleksandrov.megafood.controllers;

import kg.aleksandrov.megafood.dao.UserRepo;
import kg.aleksandrov.megafood.models.dto.UserDto;
import kg.aleksandrov.megafood.models.entity.User;
import kg.aleksandrov.megafood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public void saveUser(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
    }

    @GetMapping("/login")
    public String login(@RequestParam String phone, @RequestParam String pin){

    }

}

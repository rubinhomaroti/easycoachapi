package br.com.fiap.easycoachapi.controller;

import br.com.fiap.easycoachapi.dto.AuthDTO;
import br.com.fiap.easycoachapi.dto.JwtDTO;
import br.com.fiap.easycoachapi.dto.UserCreateDTO;
import br.com.fiap.easycoachapi.dto.UserDTO;
import br.com.fiap.easycoachapi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO createUser(@RequestBody UserCreateDTO userCreateDTO) {
        return userService.create(userCreateDTO);
    }

    @PostMapping("login")
    public JwtDTO login(@RequestBody AuthDTO authDTO) {
        return userService.login(authDTO);
    }
}
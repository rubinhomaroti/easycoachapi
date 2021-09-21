package br.com.fiap.easycoachapi.service;

import br.com.fiap.easycoachapi.dto.AuthDTO;
import br.com.fiap.easycoachapi.dto.JwtDTO;
import br.com.fiap.easycoachapi.dto.UserCreateDTO;
import br.com.fiap.easycoachapi.dto.UserDTO;

public interface UserService {
    UserDTO create(UserCreateDTO userCreateDTO);
    JwtDTO login(AuthDTO authDTO);
}

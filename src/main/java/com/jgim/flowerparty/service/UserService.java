package com.jgim.flowerparty.service;

import com.jgim.flowerparty.model.dto.UserDTO;
import com.jgim.flowerparty.model.entity.User;

public interface UserService {
    User insertUser(UserDTO userDTO);
    void login(UserDTO userDTO);

    void updatePw(UserDTO userDTO);
    void updateName(UserDTO userDTO);
    void updateEmail(UserDTO userDTO);
}

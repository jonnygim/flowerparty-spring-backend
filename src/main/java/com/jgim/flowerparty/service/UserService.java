package com.jgim.flowerparty.service;

import com.jgim.flowerparty.model.dto.UserDTO;

public interface UserService {
    void insertUser(UserDTO userDTO);
    void login(UserDTO userDTO);

    void updatePw(UserDTO userDTO);
    void updateName(UserDTO userDTO);
    void updateEmail(UserDTO userDTO);
}

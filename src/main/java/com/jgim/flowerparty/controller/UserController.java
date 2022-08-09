package com.jgim.flowerparty.controller;

import com.jgim.flowerparty.model.dto.UserDTO;
import com.jgim.flowerparty.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class UserController {

    @Autowired
    private final UserService userService;

    // 회원 가입
    public void insertUser(@RequestBody UserDTO userDTO) {
        userService.insertUser(userDTO);
    }

    // 로그인
    public void login(UserDTO userDTO) {
        userService.login(userDTO);
    }

    // 비밀번호 수정
    public void updatePw(UserDTO userDTO) {
        userService.updatePw(userDTO);
    }

    // 닉네임 수정
    public void updateName(UserDTO userDTO) {
        userService.updateName(userDTO);
    }

    // 이메일 수정
    public void updateEmail(UserDTO userDTO) {
        userService.updateEmail(userDTO);
    }
}

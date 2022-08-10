package com.jgim.flowerparty.service;

import com.jgim.flowerparty.model.dto.UserDTO;
import com.jgim.flowerparty.model.entity.User;
import com.jgim.flowerparty.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    private final PasswordEncoder bCryptPasswordEncoder;

    @Override
    public User insertUser(UserDTO userDTO) {
        User user = userRepository.findByEmail(userDTO.getEmail()).orElse(null);
        if (user != null) throw new RuntimeException("이미 등록된 이메일입니다.");

//        User saveUser = User.builder()
//                .password(passwordEncoder.encode(userDTO.getPassword()))
//                .email(userDTO.getEmail())
//                .nickName(userDTO.getNickName())
//                .build();

//        userRepository.save(saveUser);



        user.hashPassword(bCryptPasswordEncoder);

        // test 를 위해 user return
        return userRepository.save(user);

    }

    @Override
    public void login(UserDTO userDTO) {

    }

    @Override
    public void updatePw(UserDTO userDTO) {

    }

    @Override
    public void updateName(UserDTO userDTO) {

    }

    @Override
    public void updateEmail(UserDTO userDTO) {

    }


}

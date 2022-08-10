package com.jgim.flowerparty.model.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;


@Entity
@Builder
@Getter
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;

    @Column(nullable = false, name="password")
    private String password;

    @Column(nullable = false, name="email")
    private String email;

    @Column(nullable = false, name="nickname")
    private String nickname;

    public User(String password, String email, String nickname) {
        this.password = password;
        this.email = email;
        this.nickname = nickname;
    }

    @Builder
    public User(int userId, String password, String email, String nickname) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
    }

    /**
     * 비밀번호를 암호화
     * @param passwordEncoder 암호화 할 인코더 클래스
     * @return 변경된 유저 Entity
     */
    public User hashPassword(PasswordEncoder passwordEncoder) {
        this.password = passwordEncoder.encode(this.password);
        return this;
    }

    /**
     * 비밀번호 확인
     * @param plainPassword 암호화 이전의 비밀번호
     * @param passwordEncoder 암호화에 사용된 클래스
     * @return true | false
     */
    public boolean checkPassword(String plainPassword, PasswordEncoder passwordEncoder) {
        return passwordEncoder.matches(plainPassword, this.password);
    }
}

package com.jgim.flowerparty.model.entity;

import lombok.Builder;
import lombok.Getter;

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
}

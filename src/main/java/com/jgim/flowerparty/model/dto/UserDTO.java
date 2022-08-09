package com.jgim.flowerparty.model.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDTO {
    private String userId;
    private String password;
    private String email;
    private String nickname;
    private boolean havePlant;

    public UserDTO() {}

    @Builder
    public UserDTO(String userId, String password, String email, String nickname, boolean havePlant) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.havePlant = havePlant;
    }
}

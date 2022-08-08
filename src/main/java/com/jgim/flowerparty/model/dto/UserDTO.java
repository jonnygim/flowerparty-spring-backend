package com.jgim.flowerparty.model.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDTO {
    private String userId;
    private String userPw;
    private String userEmail;
    private String userName;
    private boolean havePlant;

    public UserDTO() {}

    @Builder
    public UserDTO(String userId, String userPw, String userEmail, String userName, boolean havePlant) {
        this.userId = userId;
        this.userPw = userPw;
        this.userEmail = userEmail;
        this.userName = userName;
        this.havePlant = havePlant;
    }
}

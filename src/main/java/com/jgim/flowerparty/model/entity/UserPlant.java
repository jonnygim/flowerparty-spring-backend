package com.jgim.flowerparty.model.entity;

import com.jgim.flowerparty.model.dto.PlantDTO;
import com.jgim.flowerparty.model.dto.UserDTO;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@Getter
@Table(name="user_plant")
public class UserPlant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_plant_id")
    private String userPlantId;

    @Column(nullable = false, name="nickname")
    private String nickname;

    @Column(nullable = false, name="reg_date")
    private Date regDate;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name="user_id")
    private User userId;

    @ManyToOne(targetEntity = Plant.class)
    @JoinColumn(name="plant_id")
    private Plant plantId;
}

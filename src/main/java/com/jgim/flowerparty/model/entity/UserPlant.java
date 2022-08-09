package com.jgim.flowerparty.model.entity;

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

    @ManyToOne
    @JoinColumn(name="user_id")
    private String userId;

    @ManyToOne
    @JoinColumn(name="plant_id")
    private String plantId;
}

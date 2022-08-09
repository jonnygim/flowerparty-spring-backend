package com.jgim.flowerparty.model.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Table(name="plants")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="plant_id")
    private String plantId;

    @Column(nullable = false, name="plant_name")
    private String plantName;

    @Column(nullable = false, name="origin")
    private String origin;

    @Column(nullable = false, name="class")
    private String plantClass;

    @Column(nullable = false, name="info")
    private String info;

    @Builder
    public Plant(String plantId, String plantName, String origin, String plantClass, String info) {
        this.plantId = plantId;
        this.plantName = plantName;
        this.origin = origin;
        this.plantClass = plantClass;
        this.info = info;
    }
}

package com.jgim.flowerparty.model.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlantDTO {
    private int plantId;
    private String plantName;
    private String origin;
    private String plantClass;
    private String info;

    public PlantDTO() {}

    @Builder
    public PlantDTO(int plantId, String plantName, String origin, String plantClass, String info) {
        this.plantId = plantId;
        this.plantName = plantName;
        this.origin = origin;
        this.plantClass = plantClass;
        this.info = info;
    }
}

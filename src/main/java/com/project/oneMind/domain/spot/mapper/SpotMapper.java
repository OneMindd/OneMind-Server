package com.project.oneMind.domain.spot.mapper;

import com.project.oneMind.domain.spot.domain.SpotEntity;
import com.project.oneMind.domain.spot.dto.Spot;
import org.springframework.stereotype.Component;

@Component
public class SpotMapper {

    public Spot toSpot(SpotEntity entity){
        return Spot.builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .name(entity.getName())
                .content(entity.getContent())
                .lat(entity.getLat())
                .lng(entity.getLng())
                .timeTaken(entity.getTimeTaken())
                .build();
    }

    public SpotEntity toCreate(Spot spot){
        return SpotEntity.builder()
                .id(spot.getId())
                .userId(spot.getUserId())
                .content(spot.getContent())
                .name(spot.getName())
                .lng(spot.getLng())
                .lat(spot.getLat())
                .timeTaken(spot.getTimeTaken())
                .build();
    }

}

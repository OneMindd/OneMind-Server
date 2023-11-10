package com.project.oneMind.domain.spot.dto.request;

import com.project.oneMind.domain.spot.dto.Spot;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpotRequest {

    private Long id;
    private String name;
    private String content;
    private Long userId;
    private String lat;
    private String lng;
    private LocalDateTime timeTaken;

    public Spot toSpot(){
        return Spot.builder()
                .id(this.id)
                .name(this.name)
                .userId(this.userId)
                .content(this.content)
                .lat(this.lat)
                .lng(this.lng)
                .timeTaken(this.timeTaken)
                .build();
    }

}

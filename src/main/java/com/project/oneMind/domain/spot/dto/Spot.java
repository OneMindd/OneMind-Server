package com.project.oneMind.domain.spot.dto;

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
public class Spot {

    private Long id;
    private String name;
    private String content;
    private String lat;
    private Long userId;
    private String lng;
    private LocalDateTime timeTaken;

}

package com.project.oneMind.domain.schedule.dto;

import com.project.oneMind.domain.Spot.domain.SpotEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Schedule {
    private Long id;
    private Long userId;
    private SpotEntity spot;
}

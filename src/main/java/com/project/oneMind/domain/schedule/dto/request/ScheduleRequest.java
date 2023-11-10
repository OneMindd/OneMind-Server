package com.project.oneMind.domain.schedule.dto.request;

import com.project.oneMind.domain.Spot.domain.SpotEntity;
import com.project.oneMind.domain.schedule.dto.Schedule;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ScheduleRequest {
    private Long id;
    private Long userId;
    private SpotEntity spot;

    public Schedule toSchedule(){
        return Schedule.builder()
                .id(this.id)
                .userId(this.userId)
                .spot(this.spot)
                .build();
    }
}


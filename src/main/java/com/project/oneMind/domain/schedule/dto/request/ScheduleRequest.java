package com.project.oneMind.domain.schedule.dto.request;

import com.project.oneMind.domain.schedule.dto.Schedule;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ScheduleRequest {
    private Long id;
    private String title;
    private Long spotId;
    private Long userId;

    public Schedule toSchedule(){
        return Schedule.builder()
                .id(this.id)
                .title(this.title)
                .userId(this.userId)
                .spotId(this.spotId)
                .build();
    }
}

package com.project.oneMind.domain.schedule.dto.request;

import com.project.oneMind.domain.schedule.dto.Schedule;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScheduleRequest {
    private Long id;
    private Long userId;
    private String title;
    private String content;

    public Schedule toSchedule(){
        return Schedule.builder()
                .id(this.id)
                .userId(this.userId)
                .title(this.title)
                .content(this.content)
                .build();
    }
}


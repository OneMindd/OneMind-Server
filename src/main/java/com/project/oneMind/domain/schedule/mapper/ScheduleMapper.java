package com.project.oneMind.domain.schedule.mapper;

import com.project.oneMind.domain.schedule.domain.ScheduleEntity;
import com.project.oneMind.domain.schedule.dto.Schedule;
import org.springframework.stereotype.Component;

@Component
public class ScheduleMapper {

    public Schedule toSchedule(ScheduleEntity entity){
        return Schedule.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .userId(entity.getUserId())
                .spotId(entity.getSpotId())
                .totalTime(entity.getTotalTime())
                .build();
    }

    public ScheduleEntity toCreate(Schedule schedule){
        return ScheduleEntity.builder()
                .id(schedule.getId())
                .spotId(schedule.getSpotId())
                .title(schedule.getTitle())
                .userId(schedule.getUserId())
                .totalTime(schedule.getTotalTime())
                .build();
    }
}

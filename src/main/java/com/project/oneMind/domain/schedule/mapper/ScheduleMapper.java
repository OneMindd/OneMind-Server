package com.project.oneMind.domain.schedule.mapper;

import com.project.oneMind.domain.schedule.domain.ScheduleEntity;
import com.project.oneMind.domain.schedule.dto.Schedule;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduleMapper {
    public Schedule toSchedule(ScheduleEntity entity){
        return Schedule.builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .spot(entity.getSpot())
                .build();
    }

    public ScheduleEntity toCreate(Schedule schedule){
        return ScheduleEntity.builder()
                .id(schedule.getId())
                .userId(schedule.getUserId())
                .spot(schedule.getSpot())
                .createdDateTime(LocalDateTime.now())
                .build();
    }
}

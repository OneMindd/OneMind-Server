package com.project.oneMind.domain.schedule.mapper;

import com.project.oneMind.domain.schedule.domain.ScheduleEntity;
import com.project.oneMind.domain.schedule.dto.Schedule;
import org.springframework.stereotype.Component;

@Component
public class ScheduleMapper {
    public Schedule toSchedule(ScheduleEntity entity){
        return Schedule.builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .arriveTime(entity.getArriveTime())
                .build();
    }

    public ScheduleEntity toCreate(Schedule schedule){
        return ScheduleEntity.builder()
                .id(schedule.getId())
                .userId(schedule.getUserId())
                .content(schedule.getContent())
                .title(schedule.getTitle())
                .arriveTime(schedule.getArriveTime())
                .build();
    }
}

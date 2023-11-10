package com.project.oneMind.domain.schedule.service.querydsl;

import com.project.oneMind.domain.schedule.dto.Schedule;
import com.project.oneMind.global.dto.PageRequest;

import java.util.List;

public interface ScheduleQueryService {
    List<Schedule> findSchedule(PageRequest request);
}

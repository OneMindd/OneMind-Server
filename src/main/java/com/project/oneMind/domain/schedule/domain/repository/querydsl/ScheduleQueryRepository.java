package com.project.oneMind.domain.schedule.domain.repository.querydsl;

import com.project.oneMind.domain.schedule.dto.Schedule;
import com.project.oneMind.global.dto.PageRequest;

import java.util.List;

public interface ScheduleQueryRepository {
    List<Schedule> findSchedule(PageRequest request, Long userId);
}

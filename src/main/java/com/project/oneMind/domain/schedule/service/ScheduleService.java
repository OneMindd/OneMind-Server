package com.project.oneMind.domain.schedule.service;

import com.project.oneMind.domain.schedule.dto.Schedule;

public interface ScheduleService {
    void register(Schedule schedule);
    void refuse(Long id);

}

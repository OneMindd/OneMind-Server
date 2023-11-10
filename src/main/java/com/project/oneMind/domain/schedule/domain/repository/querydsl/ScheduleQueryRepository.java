package com.project.oneMind.domain.schedule.domain.repository.querydsl;

import com.project.oneMind.domain.schedule.dto.Schedule;
import com.project.oneMind.global.dto.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ScheduleQueryRepository {
    List<Schedule> findMySchedule (PageRequest request, Long userId);
}

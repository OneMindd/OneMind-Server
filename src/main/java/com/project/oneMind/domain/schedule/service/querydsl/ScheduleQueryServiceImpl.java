package com.project.oneMind.domain.schedule.service.querydsl;

import com.project.oneMind.domain.schedule.domain.repository.querydsl.ScheduleQueryRepository;
import com.project.oneMind.domain.schedule.dto.Schedule;
import com.project.oneMind.global.dto.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class ScheduleQueryServiceImpl implements ScheduleQueryService{

    private final ScheduleQueryRepository scheduleQueryRepository;

    @Override
    public List<Schedule> findSchedule(PageRequest request, Long userId) {
        return scheduleQueryRepository.findSchedule(request,userId);
    }
}

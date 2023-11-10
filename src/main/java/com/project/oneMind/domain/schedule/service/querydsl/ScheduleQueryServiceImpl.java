package com.project.oneMind.domain.schedule.service.querydsl;

import com.project.oneMind.domain.schedule.domain.repository.querydsl.ScheduleQueryRepositoryImpl;
import com.project.oneMind.domain.schedule.dto.Schedule;
import com.project.oneMind.global.dto.PageRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Getter
@Service
@RequiredArgsConstructor
public class ScheduleQueryServiceImpl implements ScheduleQueryService{
    ScheduleQueryRepositoryImpl queryRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<Schedule> findSchedule(PageRequest request){
        return queryRepository.findMySchedule(request);
    }


}

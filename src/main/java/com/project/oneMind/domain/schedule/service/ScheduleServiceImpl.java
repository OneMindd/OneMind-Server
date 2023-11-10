package com.project.oneMind.domain.schedule.service;

import com.project.oneMind.domain.schedule.domain.repository.ScheduleRepository;
import com.project.oneMind.domain.schedule.dto.Schedule;
import com.project.oneMind.domain.schedule.exception.ScheduleAlreadyDeletedException;
import com.project.oneMind.domain.schedule.exception.ScheduleAlreadyExistsException;
import com.project.oneMind.domain.schedule.mapper.ScheduleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService{

    private final ScheduleRepository repository;
    private final ScheduleMapper scheduleMapper;

    public void register(Schedule schedule){
        if(repository.findById(schedule.getId()).isPresent()) {
            throw ScheduleAlreadyExistsException.EXCEPTION;
        }
        repository.save(scheduleMapper.toCreate(schedule));
    } // -> 이거 스케줄 dto 말고 다른걸로 해야할듯

    public void refuse(Long id){
        if(repository.findById(id).isEmpty()){
            throw ScheduleAlreadyDeletedException.EXCEPTION;
        }
        repository.deleteById(id);
    }

}
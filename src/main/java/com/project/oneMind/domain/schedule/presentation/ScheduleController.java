package com.project.oneMind.domain.schedule.presentation;

import com.project.oneMind.domain.schedule.dto.Schedule;
import com.project.oneMind.domain.schedule.dto.request.ScheduleRequest;
import com.project.oneMind.domain.schedule.service.ScheduleService;
import com.project.oneMind.domain.schedule.service.querydsl.ScheduleQueryService;
import com.project.oneMind.global.dto.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;
    private final ScheduleQueryService scheduleQueryService;

    @PostMapping("")
    public void register(ScheduleRequest request){
        scheduleService.register(request.toSchedule());
    }

    @DeleteMapping("")
    public void refuse(ScheduleRequest request){
        scheduleService.refuse(request.getId());
    }

    @GetMapping("")
    public ResponseEntity<List<Schedule>> find(PageRequest request){
        return ResponseEntity.status(HttpStatus.OK).body(scheduleQueryService.findSchedule(request));
    }

}

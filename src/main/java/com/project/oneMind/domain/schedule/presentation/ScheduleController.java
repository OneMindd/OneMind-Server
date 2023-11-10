package com.project.oneMind.domain.schedule.presentation;

import com.project.oneMind.domain.schedule.dto.Schedule;
import com.project.oneMind.domain.schedule.dto.request.ScheduleRequest;
import com.project.oneMind.domain.schedule.service.ScheduleService;
import com.project.oneMind.domain.schedule.service.querydsl.ScheduleQueryService;
import com.project.oneMind.global.dto.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleQueryService queryService;
    private final ScheduleService scheduleService;

    @GetMapping("")
    public ResponseEntity<List<Schedule>> find(@Validated @RequestBody PageRequest request, Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(queryService.findSchedule(request,userId));
    }

    @PostMapping("/register")
    public void register(@Validated @RequestBody ScheduleRequest request){
        scheduleService.register(request.toSchedule());
    }

    @DeleteMapping("/remove")
    public void remove(@Validated @RequestBody ScheduleRequest request){
        scheduleService.remove(request.getId());
    }

}

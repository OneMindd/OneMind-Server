package com.project.oneMind.domain.schedule.exception.error;

import com.project.oneMind.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ScheduleError implements ErrorProperty {
    SCHEDULE_CONFLICT(HttpStatus.CONFLICT,"이미 존재하는 스케줄입니다."),
    SCHEDULE_NOT_FOUND(HttpStatus.NOT_FOUND,"요청하신 스케줄을 찾을 수 없습니다."),
    SCHEDULE_ALREADY_DELETED(HttpStatus.BAD_REQUEST,"이미 삭제된 요청입니다.");

    private final HttpStatus status;
    private final String message;
}

package com.project.oneMind.domain.schedule.exception;

import com.project.oneMind.domain.schedule.exception.error.ScheduleError;
import com.project.oneMind.global.exception.BusinessException;

public class ScheduleAlreadyDeletedException extends BusinessException {
    public static final ScheduleAlreadyDeletedException EXCEPTION = new ScheduleAlreadyDeletedException();

    private ScheduleAlreadyDeletedException(){super(ScheduleError.SCHEDULE_ALREADY_DELETED);}
}

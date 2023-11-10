package com.project.oneMind.domain.schedule.exception;

import com.project.oneMind.domain.schedule.exception.error.ScheduleError;
import com.project.oneMind.global.exception.BusinessException;

public class ScheduleAlreadyExistsException extends BusinessException {
    public static final ScheduleAlreadyExistsException EXCEPTION = new ScheduleAlreadyExistsException();

    private ScheduleAlreadyExistsException(){super(ScheduleError.SCHEDULE_CONFLICT);}
}

package com.project.oneMind.domain.schedule.exception;

import com.project.oneMind.domain.schedule.exception.error.ScheduleError;
import com.project.oneMind.global.exception.BusinessException;

public class ScheduleNotFoundException extends BusinessException {

    public static final ScheduleNotFoundException EXCEPTION = new ScheduleNotFoundException();

    private ScheduleNotFoundException(){super(ScheduleError.SCHEDULE_NOT_FOUND);}
}

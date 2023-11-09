package com.project.oneMind.domain.user.exception;

import com.project.oneMind.domain.user.exception.error.UserError;
import com.project.oneMind.global.exception.BusinessException;

public class UserAlreadyExistsException extends BusinessException {

    public static final UserAlreadyExistsException EXCEPTION = new UserAlreadyExistsException();

    private UserAlreadyExistsException() {
        super(UserError.USER_CONFLICT);
    }
}


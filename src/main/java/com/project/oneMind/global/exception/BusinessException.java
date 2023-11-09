package com.project.oneMind.global.exception;

import com.project.oneMind.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BusinessException extends RuntimeException {

    private final ErrorProperty error;

}


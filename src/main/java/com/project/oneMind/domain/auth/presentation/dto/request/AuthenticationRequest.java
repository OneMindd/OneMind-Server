package com.project.oneMind.domain.auth.presentation.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationRequest {

    //@Schema(description = "Google idToken")
    @NotBlank(message = "")
    private String idToken;

    //@Schema(description = "FCM Token")
    //private String fcmToken;

}

package com.project.oneMind.domain.auth.service;

import com.project.oneMind.domain.auth.presentation.dto.request.AuthenticationRequest;
import com.project.oneMind.domain.auth.presentation.dto.response.JsonWebTokenResponse;

public interface OAuth2UserService {

    JsonWebTokenResponse auth(AuthenticationRequest request);
    JsonWebTokenResponse refresh(String token);

}

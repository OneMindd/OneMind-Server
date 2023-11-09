package com.project.oneMind.global.common.repository;

import com.project.oneMind.domain.user.dto.User;
import com.project.oneMind.global.security.auth.principal.CustomUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;

@Repository
public class UserSecurityImpl implements UserSecurity {
    @Override
    public User getUser() {
        return ((CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser();
    }

}

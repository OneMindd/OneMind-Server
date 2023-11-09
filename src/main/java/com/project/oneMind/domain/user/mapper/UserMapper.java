package com.project.oneMind.domain.user.mapper;

import com.project.oneMind.domain.user.domain.UserEntity;
import com.project.oneMind.domain.user.domain.enums.UserRole;
import com.project.oneMind.domain.user.dto.User;
import com.project.oneMind.global.infra.google.dto.OAuth2Attribute;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toUser(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .email(userEntity.getEmail())
                .name(userEntity.getName())
                .userRole(userEntity.getUserRole())
                .build();
    }

    public UserEntity createEntity(OAuth2Attribute oAuth2Attribute) {
        return UserEntity.builder()
                .email(oAuth2Attribute.getEmail())
                .name(oAuth2Attribute.getName())
                .userRole(UserRole.USER)
                .build();
    }

}

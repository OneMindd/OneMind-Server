package com.project.oneMind.domain.user.domain.repository;

import com.project.oneMind.domain.user.domain.UserEntity;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("userRepository")
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email);

}

package com.project.oneMind.domain.schedule.domain.repository;

import com.project.oneMind.domain.schedule.domain.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ScheduleRepository extends JpaRepository<ScheduleEntity,Long> {
    Optional<ScheduleEntity> findByUserId(Long userId);
    Optional<ScheduleEntity> findByTitle(String title);
}

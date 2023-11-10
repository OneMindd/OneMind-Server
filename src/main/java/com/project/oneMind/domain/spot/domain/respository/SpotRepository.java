package com.project.oneMind.domain.spot.domain.respository;

import com.project.oneMind.domain.spot.domain.SpotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpotRepository extends JpaRepository<SpotEntity, Long> {
    Optional<SpotEntity> findByName(String name);
}

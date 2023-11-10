package com.project.oneMind.domain.spot.domain.respository.querydsl;

import com.project.oneMind.domain.spot.dto.Spot;
import com.project.oneMind.global.dto.PageRequest;

import java.util.List;

public interface SpotQueryRepository {
    List<Spot> findSpots(PageRequest request, Long userId);
}

package com.project.oneMind.domain.spot.service.querydsl;

import com.project.oneMind.domain.spot.dto.Spot;
import com.project.oneMind.global.dto.PageRequest;

import java.util.List;

public interface SpotQueryService {
    List<Spot> findSpots(PageRequest request, Long userId);
}

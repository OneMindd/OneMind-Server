package com.project.oneMind.domain.spot.service.querydsl;

import com.project.oneMind.domain.spot.domain.respository.querydsl.SpotQueryRepository;
import com.project.oneMind.domain.spot.dto.Spot;
import com.project.oneMind.global.dto.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpotQueryServiceImpl implements SpotQueryService{

    private final SpotQueryRepository spotQueryRepository;

    @Override
    public List<Spot> findSpots(PageRequest request, Long userId) {
        return spotQueryRepository.findSpots(request,userId);
    }
}

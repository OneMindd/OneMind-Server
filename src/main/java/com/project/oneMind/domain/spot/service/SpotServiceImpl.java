package com.project.oneMind.domain.spot.service;

import com.project.oneMind.domain.spot.domain.respository.SpotRepository;
import com.project.oneMind.domain.spot.dto.Spot;
import com.project.oneMind.domain.spot.mapper.SpotMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpotServiceImpl implements SpotService{

    private final SpotRepository repository;
    private final SpotMapper spotMapper;

    @Override
    public void register(Spot spot) {
        repository.save(spotMapper.toCreate(spot));
    }

}

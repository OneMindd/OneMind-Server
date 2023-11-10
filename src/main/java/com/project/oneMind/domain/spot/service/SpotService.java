package com.project.oneMind.domain.spot.service;

import com.project.oneMind.domain.spot.dto.Spot;

import java.util.List;

public interface SpotService {
    List<Spot> registerToList(Spot spot);
    void register(Spot spot);
}

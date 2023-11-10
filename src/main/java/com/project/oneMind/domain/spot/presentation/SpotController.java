package com.project.oneMind.domain.spot.presentation;

import com.project.oneMind.domain.spot.dto.Spot;
import com.project.oneMind.domain.spot.dto.request.SpotRequest;
import com.project.oneMind.domain.spot.service.SpotService;
import com.project.oneMind.domain.spot.service.querydsl.SpotQueryService;
import com.project.oneMind.global.dto.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/spot")
public class SpotController {
    private final SpotService spotService;
    private final SpotQueryService queryService;

    @PostMapping("")
    public void register(SpotRequest request){
        spotService.register(request.toSpot());
    }

    @GetMapping("")
    public List<Spot> findSpots(PageRequest request, SpotRequest spotRequest){
        return queryService.findSpots(request,spotRequest.getUserId());
    }
}

package com.project.oneMind.domain.spot.domain.respository.querydsl;

import com.project.oneMind.domain.spot.dto.Spot;
import com.project.oneMind.global.dto.PageRequest;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.oneMind.domain.spot.domain.QSpotEntity.spotEntity;

@Repository
@RequiredArgsConstructor
public class SpotQueryRepositoryImpl implements SpotQueryRepository{

    private final JPAQueryFactory queryFactory;
    @Override
    public List<Spot> findSpots(PageRequest request, Long userId){
        return queryFactory
                .select(spotProjection())
                .where(
                        spotEntity.userId.eq(userId)
                )
                .offset(request.getPageable().getOffset())
                .limit(request.getPageable().getPageSize())
                .fetch();

    }

    private ConstructorExpression<Spot> spotProjection(){
        return Projections.constructor(Spot.class,spotEntity.id,spotEntity.userId);
    }
}

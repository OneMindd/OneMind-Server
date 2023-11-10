package com.project.oneMind.domain.schedule.domain.repository.querydsl;

import com.project.oneMind.domain.schedule.dto.Schedule;
import com.project.oneMind.global.dto.PageRequest;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.oneMind.domain.schedule.domain.QScheduleEntity.scheduleEntity;


@Repository
@RequiredArgsConstructor
public class ScheduleQueryRepositoryImpl implements ScheduleQueryRepository{

    private final JPAQueryFactory queryFactory;
    @Override
    public List<Schedule> findSchedule(PageRequest request, Long userId){
        return queryFactory
                .select(scheduleProjection())
                .where(
                        scheduleEntity.userId.eq(userId)
                )
                .orderBy(scheduleEntity.id.desc())
                .offset(request.getPageable().getOffset())
                .limit(request.getPageable().getPageSize())
                .fetch();
    }

    private ConstructorExpression<Schedule> scheduleProjection(){
        return Projections.constructor(Schedule.class,scheduleEntity.id,scheduleEntity.title);
    }

}

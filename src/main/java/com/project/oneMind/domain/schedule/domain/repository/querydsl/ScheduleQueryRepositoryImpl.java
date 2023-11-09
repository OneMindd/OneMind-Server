package com.project.oneMind.domain.schedule.domain.repository.querydsl;

import com.project.oneMind.domain.schedule.dto.Schedule;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.oneMind.domain.article.domain.QScheduleEntity.scheduleEntity;

@Repository
@RequiredArgsConstructor
public class ScheduleQueryRepositoryImpl implements ScheduleQueryRepository{

    private final JPAQueryFactory queryFactory;

    @Override
    public Page<Schedule> findMySchedule(Pageable pageable, Long userId) {
        List<Schedule> result = queryFactory
                .select(scheduleProjection())
                .from(scheduleEntity)
                .where(equserId(userId))
                .orderBy(scheduleEntity.id.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();
        JPAQuery<Long> count = queryFactory.select(scheduleEntity.id.count())
                .from(scheduleEntity)
                .where(equserId(userId));

        return PageableExecutionUtils.getPage(result,pageable,count::fetchOne);
    }

    private ConstructorExpression<Schedule> scheduleProjection(){
        return Projections.constructor(Schedule.class, scheduleEntity.id,scheduleEntity.userId);
    }

    private BooleanExpression equserId(Long userId){
        return scheduleEntity.userId.eq(userId);
    }
}

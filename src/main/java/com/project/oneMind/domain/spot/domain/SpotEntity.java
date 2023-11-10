package com.project.oneMind.domain.spot.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SpotEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String lat;

    @Column(nullable = false)
    private String lng;

    @Column(nullable = false)
    private String name;

    private String content;

    @Column(nullable = false)
    private LocalDateTime timeTaken;
    @Builder
    public SpotEntity(Long id, Long userId, String lat, String lng, String name, String content, LocalDateTime timeTaken) {
        this.id = id;
        this.userId = userId;
        this.lat = lat;
        this.lng = lng;
        this.name = name;
        this.content = content;
        this.timeTaken = timeTaken;
    }
}

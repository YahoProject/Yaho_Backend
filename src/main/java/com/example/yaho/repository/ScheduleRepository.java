package com.example.yaho.repository;

import com.example.yaho.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Game, Long> {
}
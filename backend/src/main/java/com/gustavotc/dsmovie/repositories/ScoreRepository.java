package com.gustavotc.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavotc.dsmovie.entities.Score;
import com.gustavotc.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}

package com.mrvw.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrvw.dsmovie.entities.Score;
import com.mrvw.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

	
	
}

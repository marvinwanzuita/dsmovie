package com.mrvw.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrvw.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}

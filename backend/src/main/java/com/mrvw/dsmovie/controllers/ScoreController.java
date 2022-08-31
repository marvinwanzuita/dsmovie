package com.mrvw.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrvw.dsmovie.dto.MovieDTO;
import com.mrvw.dsmovie.dto.ScoreDTO;
import com.mrvw.dsmovie.services.ScoreService;

public class ScoreController {

	@RestController
	@RequestMapping(value = "/scores")
	public class MovieController {
		
		@Autowired ScoreService service;

		@PutMapping
		public MovieDTO findById(@RequestBody ScoreDTO dto){
			MovieDTO movieDTO = service.saveScore(dto);
			return movieDTO;
		}
		
	}
	
}

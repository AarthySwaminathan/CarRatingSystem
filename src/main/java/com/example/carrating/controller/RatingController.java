package com.example.carrating.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carrating.dto.RateResponse;
import com.example.carrating.dto.Vehicle;

@RestController
@RequestMapping("/api")
public class RatingController {
	
	@PostMapping("/rate")
	public RateResponse getScore(@RequestBody Vehicle vehicle) {
		return new RateResponse(vehicle);
	}

}

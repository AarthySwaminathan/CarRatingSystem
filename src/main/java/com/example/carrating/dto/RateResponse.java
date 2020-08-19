package com.example.carrating.dto;

import lombok.Data;

@Data
public class RateResponse {
	
	private int score;
	private String rating;

	public RateResponse(Vehicle vehicle) {
		score = vehicle.getTotalScore();
		rating = Vehicle.translate(score);
	}

}

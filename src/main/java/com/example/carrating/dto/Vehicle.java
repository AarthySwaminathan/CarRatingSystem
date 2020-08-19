package com.example.carrating.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

	private int airbags;
	private boolean autoTransmission;
	private int mileage;

	public int getTotalScore() {
		int score = 0;
		if(airbags >= 2){
			score++;
		}	
		if(autoTransmission) {
			score++;
		}
		if(mileage >= 15) {
			score++;
		}
		return score;
	}

	public static String translate(int score) {
		switch(score) {
		case 1: return "Low";
		case 2: return "Medium";
		case 3: return "High";
		default : return "Unknown Rate";
		}
	}

}
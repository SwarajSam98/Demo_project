package com.model;

import org.springframework.stereotype.Component;

@Component(value="ca")
public class CurrentAccount implements InterestCalculator {
	private double roi=5.6;
	private int duration=2;

	
	public CurrentAccount(double roi, int duration) {
		super();
		this.roi = roi;
		this.duration = duration;
	}


	public double calculate(double amt) {
		// TODO Auto-generated method stub
		return amt*duration/roi;
	}
	public CurrentAccount() {
		System.out.println("Current Called");
	}
}

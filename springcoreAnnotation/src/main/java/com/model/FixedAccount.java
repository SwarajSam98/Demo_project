package com.model;

import org.springframework.stereotype.Component;

@Component(value="fda")
public class FixedAccount implements InterestCalculator{

	private double roi=4.5;
	private int duration=3;
	
	
	public FixedAccount(double roi, int duration) {
		super();
		this.roi = roi;
		this.duration = duration;
	}


	public double calculate(double amt) {
		// TODO Auto-generated method stub
		return amt*duration/roi;
	}
	public FixedAccount() {
		System.out.println("Fixed Called");
	}
}

package com.model;

import org.springframework.stereotype.Component;

@Component(value="sa")
public class SavingAccount implements InterestCalculator{
	private double roi=4.5;
	private int duration=4;
	


	
	public SavingAccount(double roi, int duration) {
		super();
		this.roi = roi;
		this.duration = duration;
	}




	public double calculate(double amt) {
		// TODO Auto-generated method stub
		return amt*duration/roi;
	}
	public SavingAccount() {
		System.out.println("Savings Called");
	}
}




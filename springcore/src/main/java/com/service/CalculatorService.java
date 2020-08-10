package com.service;

import com.model.InterestCalculator;

public class CalculatorService {
	private InterestCalculator service;


	
	public InterestCalculator getService() {
		return service;
	}



	public void setService(InterestCalculator service) {
		this.service = service;
	}



	public double service(double amount) {
		return service.calculate(amount);
	}

}

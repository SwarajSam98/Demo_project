package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;
@Service(value="service")
public class CalculatorService {
	
	private InterestCalculator service;



public InterestCalculator getService() {
		return service;
	}



@Autowired
@Qualifier(value="fda")
	public void setService(InterestCalculator service) {
		this.service = service;
	}




	public double service(double amount) {
		 return service.calculate(amount);
	 }
}

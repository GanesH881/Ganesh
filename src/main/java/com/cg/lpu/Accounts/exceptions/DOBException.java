package com.cg.lpu.Accounts.exceptions;

public class DOBException extends Exception {

	@Override
	public String toString() {
		
		return "Minimum age of customer must be greater than or equal to 18";
	}
	

}

package com.cg.lpu.Accounts.exceptions;

public class CustomerNameException extends Exception{

	@Override
	public String toString() {
		
		return "First and Last name must start with capital letter with a space between them";
	}
	

}

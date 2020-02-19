package com.cg.lpu.Accounts.exceptions;

public class MinimumBalException extends Exception{

	public MinimumBalException() {
		System.err.println("Minimum Balance is NOT maintained");
	}
}

package com.cg.lpu.Accounts.bean;

import java.time.LocalDate;


public class AccTransaction implements Comparable<AccTransaction>{
	private String transAccountId;
	private String transType;
	private double transAmount;
	private String transOption;
	private LocalDate transDate;
	private String transChequeId;
	private String transFrom;
	private String transTo;
	private double transClosingBalance;
	
	public AccTransaction() {
		
	}
	
	
	
	public AccTransaction(String transAccountId, String transType, double transAmount, LocalDate transDate) {
		super();
		this.transAccountId = transAccountId;
		this.transType = transType;
		this.transAmount = transAmount;
		this.transDate = transDate;
	}
	public String getTransAccountId() {
		return transAccountId;
	}
	public void setTransAccountId(String transAccountId) {
		this.transAccountId = transAccountId;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransOption() {
		return transOption;
	}
	public void setTransOption(String transOption) {
		this.transOption = transOption;
	}
	public LocalDate getTransDate() {
		return transDate;
	}
	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}
	public String getTransChequeId() {
		return transChequeId;
	}
	public void setTransChequeId(String transChequeId) {
		this.transChequeId = transChequeId;
	}
	public String getTransForm() {
		return transFrom;
	}
	public void setTransForm(String transFrom) {
		this.transFrom = transFrom;
	}
	public String getTransTo() {
		return transTo;
	}
	public void setTransTo(String transTo) {
		this.transTo = transTo;
	}
	public double getTransClosingBalance() {
		return transClosingBalance;
	}
	public void setTransClosingBalance(double transClosingBalance) {
		this.transClosingBalance = transClosingBalance;
	}

	public int compareTo(AccTransaction tx) {
		return(tx.transDate.compareTo(this.transDate));
	}
	
	

}

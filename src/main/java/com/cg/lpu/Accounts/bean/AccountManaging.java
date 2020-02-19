package com.cg.lpu.Accounts.bean;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class AccountManaging {

	

		private String accountId;
		private Customer accountHolder;
		private String accountBranchId;
		private String accountType;
		private String accountStatus;
		private double accountBalance;
		private double accountInterest;
		private LocalDate lastUpdated;
		private AccTransaction trxns=new AccTransaction();
		
		

		public AccountManaging(String accountId, Customer accountHolder, String accountBranchId, String accountType,
				String accountStatus, double accountBalance, double accountInterest, LocalDate lastUpdated,
				AccTransaction trxns) {
			super();
			this.accountId = accountId;
			this.accountHolder = accountHolder;
			this.accountBranchId = accountBranchId;
			this.accountType = accountType;
			this.accountStatus = accountStatus;
			this.accountBalance = accountBalance;
			this.accountInterest = accountInterest;
			this.lastUpdated = lastUpdated;
			this.trxns = trxns;
		}

		public String getAccountId() {
			return accountId;
		}

		public Customer getAccountHolder() {
			return accountHolder;
		}

		public String getAccountBranchId() {
			return accountBranchId;
		}

		public String getAccountType() {
			return accountType;
		}

		public String getAccountStatus() {
			return accountStatus;
		}

		public double getAccountBalance() {
			return accountBalance;
		}

		public double getAccountInterest() {
			return accountInterest;
		}

		public LocalDate getLastUpdated() {
			return lastUpdated;
		}

		public AccTransaction getTrxns() {
			return trxns;
		}

		public void setTrxns(AccTransaction trxns) {
			this.trxns = trxns;
		}
		
		
	}



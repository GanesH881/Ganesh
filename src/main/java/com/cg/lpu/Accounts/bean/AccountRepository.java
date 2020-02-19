package com.cg.lpu.Accounts.bean;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
	public static final int ZERO=0;
	public static Map<String ,AccountManaging> accList=new HashMap<String ,AccountManaging>();
	 
	
	static{
		AccTransaction trxns1=new AccTransaction();
		
		
		LocalDate date1=LocalDate.of(1996,1,12);
		LocalDate date2=LocalDate.of(1996,2,22);
		LocalDate date3=LocalDate.of(1996,6,25);
		LocalDate date4=LocalDate.of(1996,1,20);
		LocalDate date5=LocalDate.of(1996,9,12);
		
		/**----CUSTOMER--------------------------------------------------------------------------------------------------------------------------------------------------------
		                  */
		Customer cust1=new Customer("ct0001001", "Rao Ramesh" , "121156982034", "XVGY258945", "9638521472" , "MALE" , date1,"H No.12/9","2nd line","Amaravathi Nagar","KURNOOL","ANDHRA PRADESH","INDIA","523110","br1001","KONDAREDDY BURG","PCNA0001001","KURNOOL");
		Customer cust2=new Customer("ct0001552", "Babu Suresh", "125153315555", "FBTN651513", "9513563153" , "MALE" , date1,"H No.14/6","3rd line","Amar Nagar","SRIKAKULAM","ANDHRA PRADESH","INDIA","523101","br1002","TEKKALI","PCNA0001002","SRIKAKULAM");
		Customer cust3=new Customer("ct0005133", "Amma Kumar", "121211112546", "KJJK321543", "8984653165" , "MALE" , date1,"H No.356/5","1st line","Jyothi market","GUNTUR","ANDHRA PRADESH","INDIA","510110","br1003","NARASARAO PET","PCNA0001003","GUNTUR");
		Customer cust4=new Customer("ct0008946", "Manasa Reddy", "115511552165", "RTHF655588", "9865316645" , "FEMALE" , date1,"H No.23/1","4th line","Maruthi Nagar","TIRUPATHI","ANDHRA PRADESH","INDIA","532008","br1004","MR PALLI","PCNA0001001","TIRUPATHI");
		
		/**----ACCOUNT MANAGER-------------------------------------------------------------------------------------------------------------------------------------------------
		                    */ 
		AccountManaging account1=new AccountManaging("100000123456", cust1, "br1001", "SAVINGS", "ACTIVE", 200065.26, 0.0, date5,trxns1);
		AccountManaging account2=new AccountManaging("100000989565", cust2, "br1002", "CURRENT", "ACTIVE", 305067.86, 0.0, date5,trxns1);
		AccountManaging account3=new AccountManaging("100000248465", cust3, "br1003", "CURRENT", "ACTIVE", 500895.59, 0.0, date5,trxns1);
		AccountManaging account4=new AccountManaging("100000985456", cust4, "br1004", "SAVINGS", "ACTIVE", 850065.69, 0.0, date5,trxns1);
		 
		accList.put(account1.getAccountId(), account1);
		accList.put(account2.getAccountId(), account2);
		accList.put(account3.getAccountId(), account3);
		accList.put(account4.getAccountId(), account4);
		
		
	}
}

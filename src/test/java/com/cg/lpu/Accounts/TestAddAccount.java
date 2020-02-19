package com.cg.lpu.Accounts;

import org.junit.jupiter.api.Test;

import com.cg.lpu.Accounts.bean.AccTransaction;
import com.cg.lpu.Accounts.bean.AccountManaging;
import com.cg.lpu.Accounts.bean.Customer;
import com.cg.lpu.Accounts.exceptions.AccountNullException;
import com.cg.lpu.Accounts.exceptions.DOBException;
import com.cg.lpu.Accounts.exceptions.ContactException;
import com.cg.lpu.Accounts.exceptions.CustomerNameException;
import com.cg.lpu.Accounts.exceptions.GenderException;
import com.cg.lpu.Accounts.exceptions.AadharException;
import com.cg.lpu.Accounts.exceptions.MinimumBalException;
import com.cg.lpu.Accounts.exceptions.AccountIdException;
import com.cg.lpu.Accounts.service.AccountManagingService;
import com.cg.lpu.Accounts.service.AccountManagingServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

public class TestAddAccount {
	AccountManagingService ser=new AccountManagingServiceImpl();
	
	@Test
	public void test1() {
		assertThrows(AccountNullException.class,()->ser.addaccount(null));
	}
	
	@Test
	public void test2() {
		LocalDate date5=LocalDate.of(1996,1,12);
		AccountManaging acc=new AccountManaging(null,null,null,null,null,0.0,0.0,date5,null);
		assertThrows(AccountNullException.class,()->ser.addaccount(acc));
	}
	
	@Test
	public void test3() {
		AccTransaction trxns1=new AccTransaction();
		LocalDate date5=LocalDate.of(1996,1,12);
		Customer cust1=new Customer("ct0001001", "Rao Ramesh" , "121156982034", "XVGY258945", "9638521472" , "MALE" , date5,"H No.12/9","2nd line","Amaravathi Nagar","KURNOOL","ANDHRA PRADESH","INDIA","523110","br1001","KONDAREDDY BURG","PCNA0001001","KURNOOL");
		AccountManaging account1=new AccountManaging("10000012345655", cust1, "br1001", "SAVINGS", "ACTIVE", 200065.26, 0.0, date5,trxns1);
		assertThrows(AccountIdException.class,()->ser.addaccount(account1));
	}
	
	@Test
	public void test4() {
		AccTransaction trxns1=new AccTransaction();
		LocalDate date5=LocalDate.of(1996,1,12);
		Customer cust1=new Customer("ct0001001", "Rao Ramesh" , "121156982034000", "XVGY258945", "9638521472" , "MALE" , date5,"H No.12/9","2nd line","Amaravathi Nagar","KURNOOL","ANDHRA PRADESH","INDIA","523110","br1001","KONDAREDDY BURG","PCNA0001001","KURNOOL");
		AccountManaging account1=new AccountManaging("100000123456", cust1, "br1001", "SAVINGS", "ACTIVE", 200065.26, 0.0, date5,trxns1);
		assertThrows(AadharException.class,()->ser.addaccount(account1));
	}
	
	@Test
	public void test5() {
		AccTransaction trxns1=new AccTransaction();
		LocalDate date5=LocalDate.of(1996,1,12);
		Customer cust1=new Customer("ct0001001", "Rao Ramesh" , "121156982034", "XVGY258945", "9638521472" , "MALE" , date5,"H No.12/9","2nd line","Amaravathi Nagar","KURNOOL","ANDHRA PRADESH","INDIA","523110","br1001","KONDAREDDY BURG","PCNA0001001","KURNOOL");
		AccountManaging account1=new AccountManaging("100000123456", cust1, "br1001", "SAVINGS", "ACTIVE", 65.26, 0.0, date5,trxns1);
		assertThrows(MinimumBalException.class,()->ser.addaccount(account1));
	}
	
	@Test
	public void test6() {
		AccTransaction trxns1=new AccTransaction();
		LocalDate date5=LocalDate.of(1996,1,12);
		Customer cust1=new Customer("ct0001001", "Rao Ramesh" , "121156982034", "XVGY258945", "9638521472" , "MALEmale" , date5,"H No.12/9","2nd line","Amaravathi Nagar","KURNOOL","ANDHRA PRADESH","INDIA","523110","br1001","KONDAREDDY BURG","PCNA0001001","KURNOOL");
		AccountManaging account1=new AccountManaging("100000123456", cust1, "br1001", "SAVINGS", "ACTIVE", 88465.26, 0.0, date5,trxns1);
		assertThrows(GenderException.class,()->ser.addaccount(account1));
	}
	
	@Test
	public void test7() {
		AccTransaction trxns1=new AccTransaction();
		LocalDate date5=LocalDate.of(1996,1,12);
		Customer cust1=new Customer("ct0001001", "Rao Ramesh" , "121156982034", "XVGY258945", "963821472" , "MALEmale" , date5,"H No.12/9","2nd line","Amaravathi Nagar","KURNOOL","ANDHRA PRADESH","INDIA","523110","br1001","KONDAREDDY BURG","PCNA0001001","KURNOOL");
		AccountManaging account1=new AccountManaging("100000123456", cust1, "br1001", "SAVINGS", "ACTIVE", 88465.26, 0.0, date5,trxns1);
		assertThrows(ContactException.class,()->ser.addaccount(account1));
	}
	
	@Test
	public void test8() {
		AccTransaction trxns1=new AccTransaction();
		LocalDate date5=LocalDate.of(2012,1,12);
		Customer cust1=new Customer("ct0001001", "Rao Ramesh" , "121156982034", "XVGY258945", "9638214722" , "MALE" , date5,"H No.12/9","2nd line","Amaravathi Nagar","KURNOOL","ANDHRA PRADESH","INDIA","523110","br1001","KONDAREDDY BURG","PCNA0001001","KURNOOL");
		AccountManaging account1=new AccountManaging("100000123456", cust1, "br1001", "SAVINGS", "ACTIVE", 88465.26, 0.0, date5,trxns1);
		assertThrows(DOBException.class,()->ser.addaccount(account1));
	}
	
	@Test
	public void test9() throws MinimumBalException, AccountIdException, AadharException, ContactException, GenderException, CustomerNameException, DOBException, AccountNullException {
		AccTransaction trxns1=new AccTransaction();
		LocalDate date5=LocalDate.of(1955,1,12);
		Customer cust1=new Customer("ct0001001", "Rao Ramesh" , "121596798203", "XVGY258945", "9638214722" , "MALE" , date5,"H No.12/9","2nd line","Amaravathi Nagar","KURNOOL","ANDHRA PRADESH","INDIA","523110","br1001","KONDAREDDY BURG","PCNA0001001","KURNOOL");
		AccountManaging account1=new AccountManaging("100000123896", cust1, "br1001", "SAVINGS", "ACTIVE", 88465.26, 0.0, date5,trxns1);
		assertEquals(true,ser.addaccount(account1));
	}
}

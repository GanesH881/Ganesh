package com.cg.lpu.Accounts;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cg.lpu.Accounts.exceptions.AccountIdException;
import com.cg.lpu.Accounts.exceptions.AccountNullException;
import com.cg.lpu.Accounts.service.AccountManagingService;
import com.cg.lpu.Accounts.service.AccountManagingServiceImpl;

public class TestDeleteAccount {
AccountManagingService ser=new AccountManagingServiceImpl();
	
	@Test
	public void test1() {
		assertThrows(AccountNullException.class,()->ser.deleteaccount(null));
	}
	@Test
	public void test2() {
		assertThrows(AccountIdException.class,()->ser.deleteaccount("743747348"));
	}
	@Test
	public void test3() throws AccountIdException, AccountNullException {
		assertEquals(true,ser.deleteaccount("100000123456"));
	}
	
	@Test
	public void test4() throws AccountIdException, AccountNullException {
		assertEquals(false,ser.deleteaccount("100000153446"));
	}
}

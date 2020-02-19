package com.cg.lpu.Accounts.service;

import java.time.LocalDate;

import com.cg.lpu.Accounts.bean.AccTransaction;
import com.cg.lpu.Accounts.bean.AccountManaging;
import com.cg.lpu.Accounts.dao.AccountManagementDao;
import com.cg.lpu.Accounts.dao.AccountmanagementDaoImpl;
import com.cg.lpu.Accounts.exceptions.AadharException;
import com.cg.lpu.Accounts.exceptions.AccountIdException;
import com.cg.lpu.Accounts.exceptions.AccountNullException;
import com.cg.lpu.Accounts.exceptions.ContactException;
import com.cg.lpu.Accounts.exceptions.CustomerNameException;
import com.cg.lpu.Accounts.exceptions.DOBException;
import com.cg.lpu.Accounts.exceptions.GenderException;
import com.cg.lpu.Accounts.exceptions.MinimumBalException;


public class AccountManagingServiceImpl implements AccountManagingService {
	AccountManagementDao accman = new AccountmanagementDaoImpl();
	
	
	public boolean addaccount(AccountManaging acc2) throws MinimumBalException, 
														   AccountIdException, 
														   AadharException, 
														   ContactException,
														   GenderException, 
														   CustomerNameException, 
														   DOBException, 
														   AccountNullException {
		//validations
		if(acc2==null)
			throw new AccountNullException();
		
		if(acc2.getAccountId()==null)
			throw new AccountNullException();
		
		if(!acc2.getAccountId().matches("[1-9][0-9]{11}"))
			throw new AccountIdException ();
		
		if(acc2.getAccountBalance()<2000)
			throw new MinimumBalException();
		
		if(!acc2.getAccountHolder().getCustomerAadhar().matches("[1-9][0-9]{11}"))
			throw new AadharException();
		
		if(!acc2.getAccountHolder().getCustomerContact().matches("[1-9][0-9]{9}"))
			throw new ContactException();
		
		if(!(acc2.getAccountHolder().getCustomerGender().equals("MALE")
				|| acc2.getAccountHolder().getCustomerGender().equals("FEMALE")))
			throw new GenderException();
		LocalDate date5=LocalDate.of(1998,1,12);
		if(acc2.getAccountHolder().getCustomerDob().isAfter(date5))
			throw new DOBException();
		
		if(accman.addaccount(acc2)) {
			AccTransaction trxns=new AccTransaction(acc2.getAccountId(),"CREDITED",acc2.getAccountBalance(), LocalDate.now());
			acc2.setTrxns(trxns); 
			return true;
			}
		else
			return false;
	}



	public boolean deleteaccount(String acc3) throws AccountIdException, AccountNullException {
	if(acc3==null)
		throw new AccountNullException();
	if(!acc3.matches("[1-9][0-9]{11}")){
		throw new AccountIdException();
	}
	
	if(accman.deleteaccount(acc3))
		return true;
	return false;
	
	}

}

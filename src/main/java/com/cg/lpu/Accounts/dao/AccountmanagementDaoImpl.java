package com.cg.lpu.Accounts.dao;

import com.cg.lpu.Accounts.bean.AccountManaging;
import com.cg.lpu.Accounts.bean.AccountRepository;
import com.cg.lpu.Accounts.exceptions.AccountIdException;

public class AccountmanagementDaoImpl implements AccountManagementDao {

	
	public  AccountManaging getaccount(String accountId) throws AccountIdException
	{
		if(!AccountRepository.accList.containsKey(accountId)) {
			throw new AccountIdException();}
			AccountRepository.accList.get(accountId);
		
	
		return null;
	
	}
	public boolean addaccount(AccountManaging acc) {
		if(!AccountRepository.accList.containsKey(acc.getAccountId())) {
			AccountRepository.accList.put(acc.getAccountId(),acc);
			return true;
		}
		
		return false;
	}
	public boolean deleteaccount(String acc1) {
		if(AccountRepository.accList.containsKey(acc1)) {
			AccountRepository.accList.remove(acc1);
			return true;
		}
		return false;
	}

}

package com.cg.lpu.Accounts.dao;

import com.cg.lpu.Accounts.bean.AccountManaging;
import com.cg.lpu.Accounts.exceptions.AccountIdException;

public interface AccountManagementDao {
	public boolean addaccount(AccountManaging acc);
	public boolean deleteaccount(String acc1);
	public  AccountManaging getaccount(String accountId) throws AccountIdException;

}

package com.cg.lpu.Accounts.service;

import com.cg.lpu.Accounts.bean.AccountManaging;
import com.cg.lpu.Accounts.exceptions.AadharException;
import com.cg.lpu.Accounts.exceptions.AccountIdException;
import com.cg.lpu.Accounts.exceptions.AccountNullException;
import com.cg.lpu.Accounts.exceptions.ContactException;
import com.cg.lpu.Accounts.exceptions.CustomerNameException;
import com.cg.lpu.Accounts.exceptions.DOBException;
import com.cg.lpu.Accounts.exceptions.GenderException;
import com.cg.lpu.Accounts.exceptions.MinimumBalException;

public interface AccountManagingService {
	public boolean addaccount(AccountManaging acc2)
            throws MinimumBalException, AccountIdException, AadharException, ContactException,
            GenderException, CustomerNameException, DOBException, AccountNullException ;
	public boolean deleteaccount(String acc3) throws AccountIdException, AccountNullException;

}

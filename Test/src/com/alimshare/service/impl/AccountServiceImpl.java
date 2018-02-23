package com.alimshare.service.impl;

import java.sql.Savepoint;

import com.alimshare.dao.AccountDao;
import com.alimshare.entity.Account;
import com.alimshare.entity.LoanAccount;
import com.alimshare.entity.SavingAccount;
import com.alimshare.factory.AccountFactory;
import com.alimshare.service.AccountService;
import com.alimshare.util.AccountTypeEnum;

public class AccountServiceImpl implements AccountService{

	@Override
	public Account getAccountByNumber(AccountTypeEnum accountType, String accountNumber) {
		AccountDao accountDao = AccountFactory.getAccountDao(accountType);
		Account account = (Account) accountDao.getAccountByNumber(accountNumber);
		return account;
	}

	@Override
	public Account saveAccountByType(Account account) {
		AccountTypeEnum accountType = AccountTypeEnum.get(account.getClass().getSimpleName());
		AccountDao accountDao = AccountFactory.getAccountDao(accountType);
		accountDao.save(account);
		return null;
	}

}

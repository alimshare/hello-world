package com.alimshare.dao.impl;

import java.math.BigDecimal;

import com.alimshare.entity.SavingAccount;

public class SavingDaoImpl extends AccountDaoImpl<SavingAccount>{

	@Override
	public SavingAccount getAccountByNumber(String accountNumber) {
		SavingAccount account = new SavingAccount();
		if (accountNumber.equals("001")){
			account.setAccountNumber(accountNumber);
			account.setBalance(new BigDecimal("50000"));
		} else {
			account.setAccountNumber(accountNumber);
			account.setBalance(new BigDecimal("20000"));
		}
		return account;
	}

}

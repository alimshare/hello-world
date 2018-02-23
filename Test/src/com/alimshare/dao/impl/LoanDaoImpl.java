package com.alimshare.dao.impl;

import java.math.BigDecimal;

import com.alimshare.entity.LoanAccount;

public class LoanDaoImpl extends AccountDaoImpl<LoanAccount>{

	@Override
	public LoanAccount getAccountByNumber(String accountNumber) {
		LoanAccount account = new LoanAccount();
		if (accountNumber.equals("001")){
			account.setAccountNumber(accountNumber);
			account.setBalance(new BigDecimal("50000"));
		} else {
			account.setAccountNumber(accountNumber);
			account.setBalance(new BigDecimal("50000"));
		}
		return account;
	}

}

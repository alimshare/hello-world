package com.alimshare.dao.impl;

import java.math.BigDecimal;

import com.alimshare.entity.GiroAccount;

public class GiroDaoImpl extends AccountDaoImpl<GiroAccount>{

	@Override
	public GiroAccount getAccountByNumber(String accountNumber) {
		GiroAccount account = new GiroAccount();
		if (accountNumber.equals("001")){
			account.setAccountNumber(accountNumber);
			account.setBalance(new BigDecimal("100000"));
		} else {
			account.setAccountNumber(accountNumber);
			account.setBalance(new BigDecimal("60000"));
		}
		return account;
	
	}

}

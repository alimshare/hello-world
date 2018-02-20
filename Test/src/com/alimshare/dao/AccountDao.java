package com.alimshare.dao;

import java.math.BigDecimal;

import com.alimshare.entity.Account;

public class AccountDao {
	
	public Account getAccountByNumber(String accountNumber){

		Account account = new Account();
		
		if (accountNumber.equals("10101")) {
			account.setId(1L);
			account.setAccountNumber("10101");
			account.setBalance(new BigDecimal("100000"));			
		} else {
			account.setId(2L);
			account.setAccountNumber("20202");
			account.setBalance(new BigDecimal("50000"));			
		}
		
		return account;
	}
	
}

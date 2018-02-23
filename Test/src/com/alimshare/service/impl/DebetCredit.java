package com.alimshare.service.impl;

import java.math.BigDecimal;

import com.alimshare.entity.Account;
import com.alimshare.service.IDebetCredit;

public class DebetCredit implements IDebetCredit<Account>{

	@Override
	public Account debit(Account account, BigDecimal amount) {
		BigDecimal debet 	= account.getBalance().subtract(amount);
		System.out.println("Debet : "+account.getBalance()+" - "+amount+" = "+debet);
		account.setBalance(debet);
		return account;
	}

	@Override
	public Account credit(Account account, BigDecimal amount) {		
		BigDecimal credit 	= account.getBalance().add(amount);
		System.out.println("Credit : "+account.getBalance()+" + "+amount+" = "+credit);
		account.setBalance(credit);
		return account;
	}
	
}

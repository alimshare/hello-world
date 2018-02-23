package com.alimshare.service;

import java.math.BigDecimal;

import com.alimshare.entity.Account;

public interface IDebetCredit<T> {
	
	public T debit(T object, BigDecimal amount);
	public T credit(T object, BigDecimal amount);
	
}

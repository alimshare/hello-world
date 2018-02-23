package com.alimshare.dao;

public interface AccountDao<T> extends BaseDao<T>{
	
	/*
	 * Dibuat generic karena setiap AccountType pasti punya accountNumber
	 */
	public T getAccountByNumber(String accountNumber);
	
}

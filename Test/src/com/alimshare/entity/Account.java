package com.alimshare.entity;

import java.math.BigDecimal;

import com.alimshare.util.AccountTypeEnum;

/*
 * implementasinya di extends / interface ?
 */
public class Account {

	private Long id;
	private String accountNumber;
	private BigDecimal balance;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public AccountTypeEnum getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountTypeEnum accountType) {
		this.accountType = accountType;
	}
	
}

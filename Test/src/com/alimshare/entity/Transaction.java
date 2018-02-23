package com.alimshare.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.alimshare.util.AccountTypeEnum;
import com.alimshare.util.TransactionStatusEnum;
import com.alimshare.util.TransactionTypeEnum;

public class Transaction {
	
	private Long 		id;
	private Account		sourceAccount;
	private Account		destinationAccount;
	private BigDecimal 	amount;
	private Date 		date;
	private String 		reference;
	private String 		description;
	
	private TransactionTypeEnum type;
	private TransactionStatusEnum status;
	
	private AccountTypeEnum accountFromType;
	private AccountTypeEnum accountToType;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public TransactionTypeEnum getType() {
		return type;
	}
	public void setType(TransactionTypeEnum type) {
		this.type = type;
	}
	public TransactionStatusEnum getStatus() {
		return status;
	}
	public void setStatus(TransactionStatusEnum status) {
		this.status = status;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public AccountTypeEnum getAccountFromType() {
		return accountFromType;
	}
	public void setAccountFromType(AccountTypeEnum accountFromType) {
		this.accountFromType = accountFromType;
	}
	public AccountTypeEnum getAccountToType() {
		return accountToType;
	}
	public void setAccountToType(AccountTypeEnum accountToType) {
		this.accountToType = accountToType;
	}
	public Account getSourceAccount() {
		return sourceAccount;
	}
	public void setSourceAccount(Account sourceAccount) {
		this.sourceAccount = sourceAccount;
	}
	public Account getDestinationAccount() {
		return destinationAccount;
	}
	public void setDestinationAccount(Account destinationAccount) {
		this.destinationAccount = destinationAccount;
	}
	
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", sourceAccount=" + sourceAccount + ", destinationAccount="
				+ destinationAccount + ", amount=" + amount + ", date=" + date + ", reference=" + reference
				+ ", description=" + description + ", type=" + type + ", status=" + status + ", accountFromType="
				+ accountFromType + ", accountToType=" + accountToType + "]";
	}
	
}

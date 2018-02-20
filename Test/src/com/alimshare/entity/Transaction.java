package com.alimshare.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.alimshare.util.DestinationTypeEnum;
import com.alimshare.util.TransactionStatusEnum;
import com.alimshare.util.TransactionTypeEnum;

public class Transaction {
	
	private Long 		id;
	private String 		accountFrom;
	private String 		accountTo;
	private BigDecimal 	amount;
	private Date 		date;
	private String 		reference;
	private String 		description;
	
	private TransactionTypeEnum type;
	private TransactionStatusEnum status;
	
	private DestinationTypeEnum destinationType;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountFrom() {
		return accountFrom;
	}
	public void setAccountFrom(String accountFrom) {
		this.accountFrom = accountFrom;
	}
	public String getAccountTo() {
		return accountTo;
	}
	public void setAccountTo(String accountTo) {
		this.accountTo = accountTo;
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
	public DestinationTypeEnum getDestinationType() {
		return destinationType;
	}
	public void setDestinationType(DestinationTypeEnum destinationType) {
		this.destinationType = destinationType;
	}	
	
}

package com.alimshare.handler;

import java.math.BigDecimal;
import java.util.Date;

import com.alimshare.dao.AccountDao;
import com.alimshare.dao.GiroDao;
import com.alimshare.dao.LoanDao;
import com.alimshare.dao.SavingDao;
import com.alimshare.entity.Account;
import com.alimshare.entity.SavingAccount;
import com.alimshare.entity.Transaction;
import com.alimshare.factory.AccountFactory;
import com.alimshare.util.DestinationTypeEnum;
import com.alimshare.util.TransactionStatusEnum;
// TODO | 2018.02.15 | ==> Bisa dipakai oleh Account SAVING, GIRO & LOAN.

public class TransferHandler {
	
	private AccountDao accountDao;
	
	/**
	 * Posting Transaction
	 * @param transaction
	 */
	public Transaction commitTransaction(Transaction transaction){
		
		accountDao = AccountFactory.getAccountDao(transaction.getDestinationType());
		
		Account source = accountDao.getAccountByNumber(transaction.getAccountFrom());
		Account target = accountDao.getAccountByNumber(transaction.getAccountTo());
		
		BigDecimal debit 	= source.getBalance().subtract(transaction.getAmount());
		BigDecimal credit 	= target.getBalance().add(transaction.getAmount());
		
		source.setBalance(debit);
		target.setBalance(credit);
		
		transaction.setStatus(TransactionStatusEnum.SUCCESS);
		transaction.setDate(new Date());
		transaction.setReference("04a5f2e4-5446-46f1-b740-8ac41f3a36e4");
		
		return transaction;
	}
	
	/**
	 * Reversal transaction
	 * @param transaction
	 */
	public void reversalTransaction(Transaction transaction){
		//TODO
		
	}
	
	public static void main(String[] args) {
		
		Transaction trx = new Transaction();
		trx.setAccountFrom("10101");
		trx.setAccountTo("20202");
		trx.setAmount(new BigDecimal("10000"));
		trx.setDestinationType(DestinationTypeEnum.SAVING);
		
		TransferHandler handler = new TransferHandler();
		handler.commitTransaction(trx);
	}
	
}

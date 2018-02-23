package com.alimshare.handler;

import java.math.BigDecimal;
import java.util.Date;

import com.alimshare.dao.AccountDao;
import com.alimshare.dao.GiroDao;
import com.alimshare.dao.LoanDao;
import com.alimshare.dao.SavingDao;
import com.alimshare.dao.TransactionDao;
import com.alimshare.dao.impl.TransactionDaoImpl;
import com.alimshare.entity.Account;
import com.alimshare.entity.Email;
import com.alimshare.entity.SavingAccount;
import com.alimshare.entity.Transaction;
import com.alimshare.factory.AccountFactory;
import com.alimshare.service.AccountService;
import com.alimshare.service.IDebetCredit;
import com.alimshare.service.impl.AccountServiceImpl;
import com.alimshare.service.impl.DebetCredit;
import com.alimshare.util.AccountTypeEnum;
import com.alimshare.util.TransactionStatusEnum;
// TODO | 2018.02.15 | ==> Bisa dipakai oleh Account SAVING, GIRO & LOAN.

public class TransferHandler {
	
	private TransactionDao transactionDao;
	private NotificationHandler notificationHandler;
	private IDebetCredit debetCreditService;
	private AccountService accountService;
	
	public TransferHandler() {
		transactionDao 		= new TransactionDaoImpl();
		debetCreditService 	= new DebetCredit();
		accountService 		= new AccountServiceImpl();
		notificationHandler = new NotificationHandler();
	}
	
	public Transaction process(Account source, Account target, BigDecimal amount) {
		Transaction transaction = new Transaction();
		
		try {
			// Get Account
			//Account source = accountService.getAccountByNumber(transaction.getAccountFromType(), transaction.getAccountFrom());
			//Account target = accountService.getAccountByNumber(transaction.getAccountToType(), transaction.getAccountTo());
			
			// commit the transaction
			transaction = commitTransaction(source, target, amount);
			
			if (transaction.getStatus() == TransactionStatusEnum.SUCCESS) {
				notificationHandler.sendEmail(new Email());
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return transaction;
	}
	
	/**
	 * Posting Transaction
	 */
	public Transaction commitTransaction(Account accountFrom, Account accountTo, BigDecimal amount){
		Transaction transaction = new Transaction();
		
		accountFrom = (Account) debetCreditService.debit(accountFrom, amount);
		accountService.saveAccountByType(accountFrom);
		
		accountTo = (Account) debetCreditService.credit(accountTo, amount);
		accountService.saveAccountByType(accountTo);
		
		transaction.setSourceAccount(accountFrom);
		transaction.setDestinationAccount(accountTo);
		transaction.setStatus(TransactionStatusEnum.SUCCESS);
		transaction.setDate(new Date());
		transaction.setReference("04a5f2e4-5446-46f1-b740-8ac41f3a36e4");
		
		transaction = transactionDao.save(transaction);
		
		return transaction;
	}
	
	/**
	 * Reversal transaction
	 * @param transaction
	 */
	public void reversalTransaction(Transaction transaction){
		//TODO
		
	}
	
}

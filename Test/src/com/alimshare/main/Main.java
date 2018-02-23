package com.alimshare.main;

import java.math.BigDecimal;

import com.alimshare.entity.Account;
import com.alimshare.entity.Transaction;
import com.alimshare.handler.TransferHandler;
import com.alimshare.service.AccountService;
import com.alimshare.service.impl.AccountServiceImpl;
import com.alimshare.util.AccountTypeEnum;

public class Main {

	private AccountService accountService;
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.accountService = new AccountServiceImpl();
		
		Account source = main.accountService.getAccountByNumber(AccountTypeEnum.SAVING, "001");
		Account target = main.accountService.getAccountByNumber(AccountTypeEnum.SAVING, "002");
		BigDecimal amount = new BigDecimal(10000);
		
		TransferHandler transferHandler = new TransferHandler();
		transferHandler.process(source, target, amount);
		
	}
	
}

package com.alimshare.service;

import com.alimshare.entity.Account;
import com.alimshare.util.AccountTypeEnum;

public interface AccountService {
	public Account getAccountByNumber(AccountTypeEnum accountType, String accountNumber);
	public Account saveAccountByType(Account account);
}

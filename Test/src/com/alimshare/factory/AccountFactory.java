package com.alimshare.factory;

import com.alimshare.dao.AccountDao;
import com.alimshare.dao.GiroDao;
import com.alimshare.dao.LoanDao;
import com.alimshare.dao.SavingDao;
import com.alimshare.dao.impl.GiroDaoImpl;
import com.alimshare.dao.impl.LoanDaoImpl;
import com.alimshare.dao.impl.SavingDaoImpl;
import com.alimshare.entity.GiroAccount;
import com.alimshare.entity.LoanAccount;
import com.alimshare.entity.SavingAccount;
import com.alimshare.util.AccountTypeEnum;

public class AccountFactory {
	
	@SuppressWarnings("rawtypes")
	public static AccountDao getAccountDao(AccountTypeEnum type){
		switch (type) {
			case SAVING: 	return new SavingDaoImpl();
			case GIRO: 		return new GiroDaoImpl();
			case LOAN: 		return new LoanDaoImpl();
			
			default: 		return new SavingDaoImpl();
		}
	}

}

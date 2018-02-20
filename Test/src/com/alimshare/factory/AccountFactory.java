package com.alimshare.factory;

import com.alimshare.dao.AccountDao;
import com.alimshare.dao.GiroDao;
import com.alimshare.dao.LoanDao;
import com.alimshare.dao.SavingDao;
import com.alimshare.util.DestinationTypeEnum;

public class AccountFactory {
	
	public static AccountDao getAccountDao(DestinationTypeEnum type){
		switch (type) {
			case SAVING:
				return new SavingDao();
			case GIRO:
				return new GiroDao();
			case LOAN:
				return new LoanDao();
			default:
				return new SavingDao();
		}
	}

}

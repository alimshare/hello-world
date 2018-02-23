package com.alimshare.util;

import java.util.HashMap;
import java.util.Map;

import com.alimshare.entity.GiroAccount;
import com.alimshare.entity.LoanAccount;
import com.alimshare.entity.SavingAccount;

public enum AccountTypeEnum {
	
	SAVING	(SavingAccount.class.getSimpleName()), 
	GIRO	(GiroAccount.class.getSimpleName()), 
	LOAN	(LoanAccount.class.getSimpleName());


    private String className;
	AccountTypeEnum(String className) {
        this.className = className;
    }

    public String className() {
        return className;
    }
    
    private static final Map<String, AccountTypeEnum> lookup = new HashMap();
    
    static {
        //Create reverse lookup hash map 
        for(AccountTypeEnum e : AccountTypeEnum.values()) lookup.put(e.className(), e);
    }
    
    public static AccountTypeEnum get(String className){
    	return lookup.get(className);
    }
    
}

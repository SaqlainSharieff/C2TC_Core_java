package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client 
{

	public static void main(String[] args) {
		BankFactory bank = new MMBankFactory();
		CurrentAcc a1=new MMCurrentAcc(969696, "jhon", 1000, 4000);
		SavingAcc a2=new MMSavingAcc(99559955, "withdraw", 100, true);
		String a=a1.toString();
		System.out.println(a);
		String b=a2.toString();
		System.out.println(b);
		//a1.getNewCurrentAccount(3021, "jhon", 1000, 5000);
		//a1.getNewSavingsAccount(188221, "withdraw", 2000, true);Client
		
		
	}

}
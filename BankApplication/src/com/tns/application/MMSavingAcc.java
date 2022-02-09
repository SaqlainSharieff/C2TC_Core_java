package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends  SavingAcc
{
     private static final float MINBAL=0;
	public MMSavingAcc(int accNo, String accNm, float accBa, boolean isSalary) {
		super(accNo, accNm, accBa, isSalary);
		// TODO Auto-generated constructor stub
	}
      public void withdraw(float MINBAL)
      {
    	  
      }
	@Override
	public String toString() {
		return "MMSavingAcc [isSalary=" + isSalary() + ", accNo=" + accNo + ", accNm=" + accNm + ", accBa=" + accBa
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
      
}

package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends  CurrentAcc
{

	public MMCurrentAcc(int accNo, String accNm, float accBa, float creditLimit) {
		super(accNo, accNm, accBa, creditLimit);
		// TODO Auto-generated constructor stub
	}
      public void withdraw(float MINBAL)
      {
    	  
      }
	@Override
	public String toString() {
		return "MMCurrentAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBa=" + accBa + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
      
}

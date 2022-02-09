package com.tns.framework;

public abstract class BankAcc 
{
	protected int accNo;
	protected String accNm;
	protected float accBa;
	
	public BankAcc(int accNo, String accNm, float accBa) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBa = accBa;
	}
	public void withdraw(float accBa ) 
	{
		
	}
	public  void deposite(float accBa)
	{
		
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBa=" + accBa + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

 }

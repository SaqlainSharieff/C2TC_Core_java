package com.tns.framework;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBa, float creditLimit) {
		super(accNo, accNm, accBa);
		this.creditLimit = creditLimit;
	}
	public void withdraw(float creditLimit)
	{
		
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + accNm + ", accBa=" + accBa
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}

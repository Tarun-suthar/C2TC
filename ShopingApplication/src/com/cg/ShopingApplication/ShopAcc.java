package com.cg.ShopingApplication;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	public void bookProduct(float charges) {
		
	}
	public void items(float charges) {
		
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

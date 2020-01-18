package com.bridgelabz.singletondesignpattern;

public enum EnumSingleTon {
	Instance;
	
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	

}

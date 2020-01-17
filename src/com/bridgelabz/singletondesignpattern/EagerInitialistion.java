package com.bridgelabz.singletondesignpattern;

public class EagerInitialistion {
	private static EagerInitialistion instance = new EagerInitialistion();
	private EagerInitialistion() {
		
	}
	public static EagerInitialistion getInstance() {
		return instance ;
	}
	public void show() {
		System.out.println("Show EagerInitialization singleton design pattern ");
	}

}

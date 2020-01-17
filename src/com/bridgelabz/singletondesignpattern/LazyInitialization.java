package com.bridgelabz.singletondesignpattern;

public class LazyInitialization {
	private static LazyInitialization instance;
	private LazyInitialization() {
		
	}
	public static LazyInitialization getInstance() {
		if(instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}
	public void show() {
		System.out.println("Show LazyInitialization singleton design pattern ");
	}


}

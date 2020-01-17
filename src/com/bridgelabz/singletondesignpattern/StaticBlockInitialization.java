package com.bridgelabz.singletondesignpattern;

public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;

	private StaticBlockInitialization() {

	}

	static {
		try {
			instance = new StaticBlockInitialization();

		} catch (Exception e) {
			throw new RuntimeException("Error");
		}

	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}

	public void show() {
		System.out.println("Show Static Block singleton design pattern ");
	}

}
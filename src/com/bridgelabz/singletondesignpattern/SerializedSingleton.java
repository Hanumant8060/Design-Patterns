package com.bridgelabz.singletondesignpattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7061979901052871783L;

	private SerializedSingleton() {

	}

	private static class SingletonHelper {
		private static SerializedSingleton instance = new SerializedSingleton();

	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}
}

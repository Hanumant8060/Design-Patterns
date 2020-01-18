package com.bridgelabz.singletondesignpattern;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		EagerInitialistion instanceOne = EagerInitialistion.getInstance();
		EagerInitialistion instanceTwo = EagerInitialistion.getInstance();
		try {
		Constructor [] constructor = EagerInitialistion.class.getDeclaredConstructors();
		for (Constructor constructor2 : constructor) {
			constructor2.setAccessible(true);
			instanceTwo = (EagerInitialistion) constructor2.newInstance();
			break;
		}
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());

}
}

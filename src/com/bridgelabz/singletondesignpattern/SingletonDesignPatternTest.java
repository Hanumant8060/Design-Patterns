package com.bridgelabz.singletondesignpattern;

public class SingletonDesignPatternTest {
	public static void main(String[] args) {
		EagerInitialistion eager = EagerInitialistion.getInstance();
		eager.show();
		// Static block initialization
		StaticBlockInitialization block = StaticBlockInitialization.getInstance();
		block.show();
		// Lazy initialization
		LazyInitialization lazy = LazyInitialization.getInstance();
		lazy.show();
		// ThreadSafe Singleton
		System.out.println("Thread safe ");
		ThreadSafeSingleton thres = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton thres1 = ThreadSafeSingleton.getInstance();
		System.out.println(thres.hashCode());
		System.out.println(thres1.hashCode());
		// Bill Pugh Singleton
		System.out.println("Bill pugh");
		BillPughSingleton billp = BillPughSingleton.getInstance();
		BillPughSingleton billp1 = BillPughSingleton.getInstance();
		System.out.println(billp.hashCode());
		System.out.println(billp1.hashCode());
		// Serialization Singleton
		System.out.println("Serialization ");
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		SerializedSingleton instanceTwo = SerializedSingleton.getInstance();
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		// EnumSingleton
		EnumSingleTon single = EnumSingleTon.Instance;
		System.out.println(single.getValue());
		single.setValue(2);
		System.out.println(single.getValue());
	}

}

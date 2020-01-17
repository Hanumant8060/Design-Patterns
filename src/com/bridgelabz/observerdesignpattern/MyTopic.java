package com.bridgelabz.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object Mutex = new Object();

	public MyTopic() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer obj) {
		// TODO Auto-generated method stub
		if (obj == null)
			throw new NullPointerException("Observer is null ");
		synchronized (Mutex) {
			if (!observers.contains(obj))
				observers.add(obj);

		}

	}

	@Override
	public void unregister(Observer obj) {
		synchronized (Mutex) {
			observers.remove(obj);
		}

	}

	@Override
	public void notifyObserver() {
		List<Observer> observerLocal = null;
		synchronized (Mutex) {
			if (!changed)
				return;
			observerLocal = new ArrayList<>(this.observers);
			this.changed = false;
		}
		for (Observer obj : observerLocal) {
			obj.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;

	}
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic: "+msg);
		this.message=msg;
		this.changed=true;
		notifyObserver();
	}

}

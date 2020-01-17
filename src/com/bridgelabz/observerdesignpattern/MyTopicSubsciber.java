package com.bridgelabz.observerdesignpattern;

public class MyTopicSubsciber implements Observer {
	private String name;
	private Subject topic;

	
	public MyTopicSubsciber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null) {
			System.out.println(name+":no new message:");
		}
		else {
			System.out.println(name+":consuming message: "+msg);
		}

	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;

	}

}

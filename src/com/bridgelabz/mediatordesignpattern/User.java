package com.bridgelabz.mediatordesignpattern;

public abstract class User {
	protected ChatMediator mediator;
	protected String name;

	public User(ChatMediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void send(String message);
	public abstract void recieve(String message);

}

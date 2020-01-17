package com.bridgelabz.mediatordesignpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	private List<User> users;

	public ChatMediatorImpl() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		for (User user1 : this.users) {
			if (user1 != user)
				user1.recieve(message);
		}

	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

}

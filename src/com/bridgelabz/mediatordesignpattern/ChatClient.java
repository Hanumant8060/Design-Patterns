package com.bridgelabz.mediatordesignpattern;

public class ChatClient {
	public static void main(String[] args) {
		ChatMediator chat = new ChatMediatorImpl();
		 User user2 = new UserImpl(chat, "Andy");
		 User user3 = new UserImpl(chat, "Rupesh");
		 User user4 = new UserImpl(chat, "AD");
		 User user5 = new UserImpl(chat, "HD");
		 chat.addUser(user2);
		 chat.addUser(user3);
		 chat.addUser(user4);
		 chat.addUser(user5);
		 user5.send("Hi All...");
	}	

}

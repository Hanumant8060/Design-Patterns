package com.bridgelabz.observerdesignpattern;

public class ObserverPatternTest {

	public static void main(String[] args) {
		MyTopic topic = new MyTopic();
		Observer obj = new MyTopicSubsciber("obj");
		Observer obj1 = new MyTopicSubsciber("obj1");
		Observer obj2 = new MyTopicSubsciber("obj2");

		topic.register(obj);
		topic.register(obj1);
		topic.register(obj2);
		
		obj.setSubject(topic);
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		
		obj.update();
		topic.postMessage("new message");
	}

}

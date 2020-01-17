package com.bridgelabz.visitorpattern;

public class ShoppingCartClient {
	public static void main(String[] args) {
		ItemElement[] item = new ItemElement[] { new Book(20, "1234"), new Book(100, "5648"), new Fruit(5, 2, "Apple"),
				new Fruit(6, 5, "Banana") };
		int total = calculatePrice(item);
		System.out.println("Total " + total);

	}

	private static int calculatePrice(ItemElement[] item) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement itemElement : item) {
			sum = sum + itemElement.accept(visitor);
		}
		return sum;
	}

}

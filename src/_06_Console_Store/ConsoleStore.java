package _06_Console_Store;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */
	private static final DecimalFormat decfor = new DecimalFormat("00.0");

	public static void main(String[] args) {
		boolean broke = false;
		boolean checkout = false;
		Cart cart = new Cart();
		Scanner scannington = new Scanner(System.in);
		double cash = 42.50;
		System.out.println(
				"Our store is going out of buisness please help \nsave us from bankruptcy by buying somethings\n");

		do {
			System.out.println(
					"Type what you want to purchase or remove\n  candy    - $2.50\n  cereal   - $9\n  clothing - $15\n  toy      - 5.50");
			System.out.println("------------------------------\nBalance: $" + decfor.format(cash += .01) + "0\n---------------");
			String thing = scannington.nextLine();
			System.out.println("\n\n");

			if (thing.equals("candy")) {
				//
				cash -= 2.5;

				//
				cart.add(new Candy());
				System.out.println(thing + " added to cart");

			} else if (thing.equals("cereal")) {
				//
				cash -= 9;

				//
				cart.add(new Cereal());
				System.out.println(thing + " added to cart");

			} else if (thing.equals("clothing")) {
				//
				cash -= 16;

				//
				cart.add(new Clothing());
				System.out.println(thing + " added to cart");

			} else if (thing.equals("toy")) {
				//
				cash -= 5.5;

				//
				cart.add(new Toy());
				System.out.println(thing + " added to cart");

			}

			else if (thing.equals("remove candy")) {
				if (cart.removeCandy()) {
					System.out.println("You put back the candy | +$2.50 to balance");
					cash += 2.5;
				}
			} else if (thing.equals("remove cereal")) {
				if (cart.removeCereal()) {
					System.out.println("You put back the cereal | +$9 to balance");
					cash += 9;
				}
			} else if (thing.equals("remove clothing")) {
				if (cart.removeClothing()) {
					System.out.println("You put back the clothing | +$15 to balance");
					cash += 15;
				}
			} else if (thing.equals("remove toy")) {
				if (cart.removeToy()) {
					System.out.println("You put back the toy | +$5.5 to balance");
					cash += 5.5;
				}
			} else if (thing.equals("view cart")) {
				cart.viewCart();
			} else if (thing.equals("checkout")) {
				if(cash>0) {
				checkout = true;
				}else {
					System.out.println("Not enough money! Type [remove (item name)] to refund");
				}
				} else {
				System.out.println("We don't sell " + thing + " here (make sure item is lowercase)");
			}

		} while (!checkout);
cart.reciept();
System.out.println("	Total spent: 	  $" + decfor.format(42.5-cash));
System.out.println("\n Thank you for your purchase, make sure to come back, please");
System.out.println("\n\nBalance left: "+decfor.format(cash)+"\n\n");
cart.showCart();
	}

}

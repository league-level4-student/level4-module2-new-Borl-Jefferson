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
		int crime = 0;
		boolean arrested =false;
		boolean checkout = false;
		Cart cart = new Cart();
		Scanner scannington = new Scanner(System.in);
		double cash = 42.50;
		System.out.println(
				"Our store is going out of buisness please help \nsave us from bankruptcy by buying somethings\n");

		do {
			System.out.println(
					"Type what you want to purchase or remove\n  candy    - $2.50  x"+cart.ca+"\n  cereal   - $9     x"+cart.ce +"\n  clothing - $15    x"+cart.cl+"\n  toy      - 5.50   x"+cart.toy);
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
			
			else if(thing.equals("rob")) {
				cash+=50;
				crime++;
				if(crime<=2) {
				System.out.println("At least spend it in our store +$50");}
				else if(crime>5) {
					arrested=true;
					checkout=true;
				}
				else if(crime>4) {
					System.out.println("*police sirens* +$50");
				}
				else if(crime>2) {
					System.out.println("Don't waste it all on clothing +$50");
				}
				
				
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
					System.out.println("Not enough money! Type (remove <item name>) to refund, or type (rob)");
				}
				} else {
				System.out.println("We don't sell " + thing + " here (make sure item is lowercase)");
			}

		} while (!checkout);
		if(arrested) {
			
			cart.arrest();
			String thing = scannington.nextLine();
		if(thing.equals("checkout")) {
			
		}
		}
		
		cart.reciept();
		if(arrested) {
		System.out.println("	Laywer          x1   $300");
		
		System.out.println("	Bribes          x1   $"+decfor.format(cash));
		cash=0;
		}
		if(crime>0) {
		System.out.println("	Felony          x"+crime+"  -$"+(crime*50));
		}
System.out.println("	Total spent: 	   $" + decfor.format(cash=((42.5+crime*50)-cash)));
if(cart.ca==0 && cart.ce==0 && cart.cl==0 && cart.toy==0) {
	System.out.print("\nMake sure to come back, please, we even gave you a free receipt");
}else {
	System.out.print("\nThank you for your purchase, make sure to come back, please");
}
cash*=-1;
System.out.println("\n\nBalance left: "+decfor.format(cash)+"");
cart.showCart();
		
		
	}

}

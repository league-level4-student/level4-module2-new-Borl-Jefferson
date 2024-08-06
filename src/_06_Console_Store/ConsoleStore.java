package _06_Console_Store;

import java.util.Scanner;
import java.text.DecimalFormat;


public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */
    	private static final DecimalFormat decfor = new DecimalFormat("00.0");
    public static void main(String[] args) {
    	boolean broke = false;
    	boolean checkout = false;
    	Cart cart = new Cart();
Scanner scannington = new Scanner(System.in);
double cash = 42.50;
System.out.println("Our store is going out of buisness please help \nsave us from bankruptcy by buying somethings\n");




do {
System.out.println("Type what you want to purchase\n  candy    - $2.50\n  cereal   - $9\n  clothing - $15\n  toy      - 5.50");
System.out.println("------------------------------\nBalance: $" +decfor.format(cash+=.01) + "0\n---------------");
String thing = scannington.nextLine();
System.out.println("\n\n");

if(thing.equals("candy")) {
 cart.add(new Candy());
 System.out.println(thing + " added to cart");
 cash-=2.49;
}else if(thing.equals("cereal")) {
    cart.add(new Cereal());
    System.out.println(thing + " added to cart");
    cash-=8.99;
}else if(thing.equals("clothing")) {
	cart.add(new Clothing());
	System.out.println(thing + " added to cart");
	cash-=22.99;
}else if(thing.equals("toy")) {
	cart.add(new Toy());	
	System.out.println(thing + " added to cart");
	cash-=16.99;
}

	if(thing.equals("remove candy")) {
	cart.removeItem(new Candy());
	}else if(thing.equals("remove cereal")) {
	cart.removeItem(new Cereal());
	}else if(thing.equals("remove clothing")) {
	cart.removeItem(new Clothing());
	}else if(thing.equals("remove toy")) {
	cart.removeItem(new Toy());
	}

else if(thing.equals("view cart")) {
	cart.showCart();
}

else {
	System.out.println("We don't sell " + thing + " here (make sure item is lowercase)");}






}while (!checkout);




    }

}

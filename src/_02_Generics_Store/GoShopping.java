package _02_Generics_Store;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
		//Cart<Candy> cand = new Cart<Candy>();
		Cart<Clothing> clth = new Cart<Clothing>();
		Cart<Toy> toy = new Cart<Toy>();
		// 3. Create another Cart object of type Cereal
		//Cart<Cereal> cere = new Cart<Cereal>();
		// 4. Add a few items to EACH cart
		/*cand.add(new Candy());
		cere.add(new Cereal());
		cand.add(new Candy());
		cere.add(new Cereal());
		cand.add(new Candy());
		cere.add(new Cereal());*/
		clth.add(new Clothing());
		toy.add(new Toy());
		clth.add(new Clothing());
		toy.add(new Toy());
		clth.add(new Clothing());
		toy.add(new Toy());
		
		
		// 5. Call the showCart() method on EACH cart
		/*cand.showCart();
		cere.showCart();*/
		clth.showCart();
		toy.showCart();
		
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		
		
		
		
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		
	}
}

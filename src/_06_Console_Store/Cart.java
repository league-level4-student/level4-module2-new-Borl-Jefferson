package _06_Console_Store;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("unchecked")
public class Cart<T extends Stuff> {
	ConsoleStore consto = new ConsoleStore();
	ArrayList<T> cart = new ArrayList<T>();
	int ca = 0;
		int ce = 0;
		int cl = 0;
		int toy = 0;

	public void add(T item) {
		cart.add(item);
		 ca = 0;
		 ce = 0;
		 cl = 0;
		 toy = 0;

		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getType().equals("candy")) {
				ca++;
			}
				if (cart.get(i).getType().equals("cereal")) {
				ce++;
				}
				if (cart.get(i).getType().equals("clothing")) {
				cl++;
				}
				if (cart.get(i).getType().equals("toy")) {
				toy++;
				
				}
		}
	}

	public void showCart() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i) != null) {

				panel.add(cart.get(i).getStuff());
			}
		}
		frame.pack();

	}

	public boolean removeCandy() {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getType().equals("candy")) {
				cart.remove(cart.get(i));
				return true;

			}
		}
		System.out.println("Silly you, you don't have any of that");
		return false;
	}

	public boolean removeCereal() {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getType().equals("cereal")) {
				cart.remove(cart.get(i));
				return true;
			}

		}
		System.out.println("Silly you, you don't have any of that");
		return false;
	}

	public boolean removeClothing() {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getType().equals("clothing")) {
				cart.remove(cart.get(i));
				return true;

			}

		}
		System.out.println("Silly you, you don't have any of that");
		return false;

	}

	public boolean removeToy() {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getType().equals("toy")) {
				cart.remove(cart.get(i));
				return true;

			}

		}
		System.out.println("Silly you, you don't have any of that");
		return false;

	}

	public void reciept() {
		System.out.println("		Console Store\n	     Users/League/Eclipse\n");
		 ca = 0;
		 ce = 0;
		 cl = 0;
		 toy = 0;

		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getType().equals("candy")) {
				ca++;
			}
				if (cart.get(i).getType().equals("cereal")) {
				ce++;
				}
				if (cart.get(i).getType().equals("clothing")) {
				cl++;
				}
				if (cart.get(i).getType().equals("toy")) {
				toy++;
				
				}
		}

		if (ca > 0) {
			System.out.println("	Candy    	x" + ca + "   $" + 2.5*ca);
		}
		if (ce > 0) {
			System.out.println("	Cereal   	x" + ce + "   $" + 9*ce);
		}
		if (cl > 0) {
			System.out.println("	Clothing 	x" + cl + "   $" + 15*cl);
		}
		if (toy > 0) {
			System.out.println("	Toy      	x" + toy + "   $" + 5.5*toy);
		}
		

	}

	public int length() {
		return cart.size();
	}

	public void viewCart() {
		int ca = 0;
		int ce = 0;
		int cl = 0;
		int toy = 0;
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getType().equals("candy")) {
				ca++;
			}
				if (cart.get(i).getType().equals("cereal")) {
				ce++;
				}
				if (cart.get(i).getType().equals("clothing")) {
				cl++;
				}
				if (cart.get(i).getType().equals("toy")) {
				toy++;
				
				}
				
	}
		
		if (ca > 0) {
			System.out.println(ca +" candy");
		}
		if (ce > 0) {
			System.out.println(ce + " cereal");
		}
		if (cl > 0) {
			System.out.println(cl + " clothing");
		}
		if (toy > 0) {
			System.out.println(toy + " toy");
		}
		
	}

	public void arrest() {
		System.out.println("The police caught you");
		System.out.println("The laywer you bought with the money you robbed did well");
		System.out.println("You're found innocent");
		System.out.println("You take out a loan to bribe the jury");
		System.out.println("\nType checkout to checkout");
	}
}



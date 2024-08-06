package _06_Console_Store;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<T extends Stuff> {
//    private T[] cart;
    ArrayList<T> cart = new ArrayList<T>();

   // public Cart() {
     //   cart = (T[]) new Stuff[20];
    //}

    // Adds an item to the cart
    public void add(T item) {
        cart.add(item);
    }

    // Displays everything currently in the cart
    public void showCart() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i) != null) {
                //panel.add(cart[i].getFood());
                panel.add(cart.get(i).getStuff());
            }
        }
        frame.pack();

    }
    
    public void removeCandy() {
    	for(int i=0; 0<i; i++) {
    		if(cart.get(i).getType().equals("candy")) {
    			cart.remove(cart.get(i));
    			System.out.println("You put back the candy");
    			break;
    		}
    	}
    	System.out.println("Silly you, you didn't get any of that");
    }
    
    public void removeCereal() {
    	for(int i=0; 0<i; i++) {
    		if(cart.get(i).getType().equals("cereal")) {
    			cart.remove(cart.get(i));
    			System.out.println("You put back the cereal");
    			break;
    		}
    	}
    	System.out.println("Silly you, you didn't get any of that");
    }
    
    public void removeClothing() {
    	for(int i=0; 0<i; i++) {
    		if(cart.get(i).getType().equals("clothing")) {
    			cart.remove(cart.get(i));
    			System.out.println("You put back the clothing");
    			break;
    		}
    	}
    	System.out.println("Silly you, you didn't get any of that");
    }
    
    public void removeToy() {
    	for(int i=0; 0<i; i++) {
    		if(cart.get(i).getType().equals("toy")) {
    			cart.remove(cart.get(i));
    			System.out.println("You put back the toy");
    			break;
    		}
    	}
    	System.out.println("Silly you, you didn't get any of that");
    }
    
    
   

    public int length() {
        return cart.size();
    }
}

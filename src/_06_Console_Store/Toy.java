package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Toy extends Stuff {
	public Toy() {
		if(new Random().nextBoolean()) {
			this.item = "toy1.jpeg";
		}
		else {
			this.item = "toy2.jpeg";
		}
	}

	@Override
	public JLabel getStuff() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}

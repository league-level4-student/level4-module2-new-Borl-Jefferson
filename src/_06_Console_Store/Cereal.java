package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cereal extends Stuff{
	public Cereal() {
		if(new Random().nextBoolean()) {
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
	}

	@Override
	public JLabel getStuff() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	public String getType() {
		return "cereal";
	}
}

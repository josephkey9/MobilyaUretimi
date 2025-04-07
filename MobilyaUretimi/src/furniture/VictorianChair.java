package furniture;

import javax.swing.ImageIcon;

class VictorianChair implements Furniture {
	public Furniture clone() {
		return new VictorianChair();
	}

	public ImageIcon getImage() {
		return new ImageIcon("\"C:\\Users\\Casper\\Pictures\\Screenshots\\Ekran görüntüsü 2025-04-07 175926.png\"");
	}

	public String getName() {
		return "Victorian Chair";
	}
}

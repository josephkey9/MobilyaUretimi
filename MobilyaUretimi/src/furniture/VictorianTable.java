package furniture;

import javax.swing.ImageIcon;

class VictorianTable implements Furniture {
	public Furniture clone() {
		return new VictorianTable();
	}

	public ImageIcon getImage() {
		return new ImageIcon("\"C:\\Users\\Casper\\Pictures\\Screenshots\\Ekran görüntüsü 2025-04-07 175934.png\"");
	}

	public String getName() {
		return "Victorian Table";
	}
}

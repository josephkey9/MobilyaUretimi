package furniture;

import javax.swing.ImageIcon;

class ModernChair implements Furniture {
	public Furniture clone() {
		return new ModernChair();
	}

	public ImageIcon getImage() {
		return new ImageIcon("\"C:\\Users\\Casper\\Pictures\\Screenshots\\Ekran görüntüsü 2025-04-07 175938.png\"");
	}

	public String getName() {
		return "Modern Chair";
	}
}
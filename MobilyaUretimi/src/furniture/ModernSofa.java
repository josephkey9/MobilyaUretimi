package furniture;

import javax.swing.ImageIcon;

class ModernSofa implements Furniture {
	public Furniture clone() {
		return new ModernSofa();
	}

	public ImageIcon getImage() {
		return new ImageIcon("\"C:\\Users\\Casper\\Pictures\\Screenshots\\Ekran görüntüsü 2025-04-07 175942.png\"");
	}

	public String getName() {
		return "Modern Sofa";
	}
}
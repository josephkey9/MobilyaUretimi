package furniture;

import javax.swing.ImageIcon;

class ModernTable implements Furniture {
	public Furniture clone() {
		return new ModernTable();
	}

	public ImageIcon getImage() {
		return new ImageIcon("\"C:\\Users\\Casper\\Pictures\\Screenshots\\Ekran görüntüsü 2025-04-07 175946.png\"");
	}

	public String getName() {
		return "Modern Table";
	}
}
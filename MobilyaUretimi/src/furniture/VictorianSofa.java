package furniture;

import javax.swing.ImageIcon;

class VictorianSofa implements Furniture {
	public Furniture clone() {
		return new VictorianSofa();
	}

	public ImageIcon getImage() {
		return new ImageIcon("\"C:\\Users\\Casper\\Pictures\\Screenshots\\Ekran görüntüsü 2025-04-07 175929.png\"");
	}

	public String getName() {
		return "Victorian Sofa";
	}
}
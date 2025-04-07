package furniture;

import javax.swing.ImageIcon;

class ArtDecoSofa implements Furniture {
	public Furniture clone() {
		return new ArtDecoSofa();
	}

	public ImageIcon getImage() {
		return new ImageIcon("\"C:\\Users\\Casper\\Pictures\\Screenshots\\ArtDecoSofa.png\"");
	}

	public String getName() {
		return "ArtDeco Sofa";
	}
}

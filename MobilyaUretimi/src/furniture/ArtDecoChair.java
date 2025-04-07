package furniture;

import javax.swing.ImageIcon;

class ArtDecoChair implements Furniture {
	public Furniture clone() {
		return new ArtDecoChair();
	}

	public ImageIcon getImage() {
		return new ImageIcon("\"C:\\Users\\Casper\\Pictures\\Screenshots\\ArtDecoChair.png\"");
	}

	public String getName() {
		return "ArtDeco Chair";
	}
}
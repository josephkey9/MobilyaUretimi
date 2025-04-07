package furniture;

import javax.swing.ImageIcon;

class ArtDecoTable implements Furniture {
	public Furniture clone() {
		return new ArtDecoTable();
	}

	public ImageIcon getImage() {
		return new ImageIcon("\"C:\\Users\\Casper\\Pictures\\Screenshots\\ArtDecoCoffeeTable.png\"");
	}

	public String getName() {
		return "ArtDeco Table";
	}
}
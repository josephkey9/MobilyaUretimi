package furniture;

import javax.swing.ImageIcon;

interface Furniture extends Cloneable {
	Furniture clone();

	ImageIcon getImage();

	String getName();
}
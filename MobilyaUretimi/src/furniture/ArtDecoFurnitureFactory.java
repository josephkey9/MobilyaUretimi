package furniture;

class ArtDecoFactory implements FurnitureFactory {
	public Furniture createChair() {
		return new ArtDecoChair();
	}

	public Furniture createSofa() {
		return new ArtDecoSofa();
	}

	public Furniture createCoffeeTable() {
		return new ArtDecoTable();
	}
}
package furniture;

class ModernFactory implements FurnitureFactory {
	public Furniture createChair() {
		return new ModernChair();
	}

	public Furniture createSofa() {
		return new ModernSofa();
	}

	public Furniture createCoffeeTable() {
		return new ModernTable();
	}
}
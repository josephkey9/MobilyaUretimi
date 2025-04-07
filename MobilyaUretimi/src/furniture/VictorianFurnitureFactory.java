package furniture;

class VictorianFactory implements FurnitureFactory {
	public Furniture createChair() {
		return new VictorianChair();
	}

	public Furniture createSofa() {
		return new VictorianSofa();
	}

	public Furniture createCoffeeTable() {
		return new VictorianTable();
	}
}

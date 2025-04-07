package furniture;

class FactoryManager {
	private static FactoryManager instance;

	private FactoryManager() {
	}

	public static FactoryManager getInstance() {
		if (instance == null)
			instance = new FactoryManager();
		return instance;
	}

	public FurnitureFactory getFactory(String style) {
		return switch (style) {
		case "ArtDeco" -> new ArtDecoFactory();
		case "Victorian" -> new VictorianFactory();
		case "Modern" -> new ModernFactory();
		default -> null;
		};
	}
}

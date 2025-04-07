package furniture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FurnitureApp {
	private JFrame frame;
	private JLabel imageLabel;
	private JComboBox<String> styleBox;
	private JComboBox<String> typeBox;

	public FurnitureApp() {
		// JFrame ve diğer bileşenlerin kurulumu
		frame = new JFrame("Mobilya Üretimi - Abstract Factory");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 500);
		frame.setLayout(new BorderLayout());

		// Üst panelde stil ve tür seçimi için JComboBox'lar
		JPanel topPanel = new JPanel();
		styleBox = new JComboBox<>(new String[] { "ArtDeco", "Victorian", "Modern" });
		typeBox = new JComboBox<>(new String[] { "Chair", "Sofa", "CoffeeTable" });
		JButton showButton = new JButton("Mobilyayı Göster");

		topPanel.add(new JLabel("Stil:"));
		topPanel.add(styleBox);
		topPanel.add(new JLabel("Tür:"));
		topPanel.add(typeBox);
		topPanel.add(showButton);

		// Mobilya görseli gösterme alanı
		imageLabel = new JLabel("Mobilya görseli burada gösterilecek", JLabel.CENTER);

		// JFrame'e bileşenleri ekliyoruz
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(imageLabel, BorderLayout.CENTER);

		// Butona tıklama işlemi
		showButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String style = (String) styleBox.getSelectedItem();
				String type = (String) typeBox.getSelectedItem();

				// FactoryManager'ı kullanarak uygun factory'yi alıyoruz
				FurnitureFactory factory = FactoryManager.getInstance().getFactory(style);

				// Seçilen türü kullanarak mobilyayı oluşturuyoruz
				Furniture furniture = null;
				if ("Chair".equals(type)) {
					furniture = factory.createChair();
				} else if ("Sofa".equals(type)) {
					furniture = factory.createSofa();
				} else if ("CoffeeTable".equals(type)) {
					furniture = factory.createCoffeeTable();
				}

				// Mobilya adı ve görselini güncelliyoruz
				if (furniture != null) {
					imageLabel.setText(furniture.getName());
					imageLabel.setIcon(furniture.getImage());
				} else {
					imageLabel.setText("Geçersiz Seçim");
					imageLabel.setIcon(null);
				}
			}
		});

		// Görünümü gösteriyoruz
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FurnitureApp();
	}
}

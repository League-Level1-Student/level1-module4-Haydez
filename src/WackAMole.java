import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WackAMole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void makeGUI() {
		Random r = new Random();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(250, 300);
		drawButtons(r.nextInt(24));
	}
	void drawButtons(int button) {
		for (int i = 0; i < 24; i++) {
			JButton buton = new JButton("bruh");
			if(i == button) {
				buton.setText("mol!");	
			}
			panel.add(buton);
		}
		
	}
}

import java.util.Random;

import javax.swing.*;

public class TypingTutor {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	public void makeGUI() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Type Or Die");
		frame.pack();
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
	}
	
}

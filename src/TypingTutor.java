import javax.swing.*;

public class TypingTutor {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public void makeGUI() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Type Or Die");
	}
}
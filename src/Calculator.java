import javax.swing.*;

public class Calculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JButton calculate = new JButton();
	JTextField x = new JTextField();
	JTextField y = new JTextField();
	public void makeGUI() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		frame.add(x);
		frame.add(y);
		
		
	}
	
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener {
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
		panel.add(x);
		x.setText("PEEPEE hard");
		panel.add(y);
		y.setText("peepee soft");
		panel.add(add);
		panel.add(subtract);
		panel.add(divide);
		panel.add(multiply);
		add.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			
		}
		if(e.getSource().equals(subtract)) {
			
		}
		if(e.getSource().equals(multiply)) {
			
		}
		if(e.getSource().equals(divide)) {
			
		}
	}
	
}

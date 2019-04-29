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
	JLabel answer = new JLabel();
	public void makeGUI() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		panel.add(x);
		x.setText("     ");
		panel.add(y);
		y.setText("     ");
		panel.add(add);
		panel.add(subtract);
		panel.add(divide);
		panel.add(multiply);
		panel.add(answer);
		answer.setSize(10, 10);
		add.setText("+");
		subtract.setText("-");
		multiply.setText("x");
		divide.setText("÷"); 
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(x.getText().trim());
		int b = Integer.parseInt(y.getText().trim());
	
		
		if(e.getSource().equals(add)) {
			int sum = a + b;
			answer.setText("" + sum);
		}
		if(e.getSource().equals(subtract)) {
			int sub = a - b;
			answer.setText("" + sub);
		}
		if(e.getSource().equals(multiply)) {
			int mult =  a * b;
			answer.setText("" + mult);
		}
		if(e.getSource().equals(divide)) {
			int div = a / b;
			answer.setText("" + div);
		}
		frame.pack();
	}
	
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Joke");
	JButton button2 = new JButton("Punchline");
	
	void makeGUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JOptionPane.showMessageDialog(null, "henlo");
		}
		else if(e.getSource()==button2) {
			JOptionPane.showMessageDialog(null,"hahahaha that was so funny");
		}
		
	}
	
}

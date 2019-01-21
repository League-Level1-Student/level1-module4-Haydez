import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton button1 = new JButton();
 void createGUI() {
	// TODO Auto-generated method stub
	frame.add(panel);
	frame.setVisible(true);
	panel.setName("Halloween");
	panel.add(button);
	panel.add(button1);
	button.addActionListener(this);
	button1.addActionListener(this);
	button.setText("Treat");
	button1.setText("Trick");
	frame.pack();
}
 private void showPictureFromTheInternet(String imageUrl) {
	    try {
	         URL url = new URL(imageUrl);
	         Icon icon = new ImageIcon(url);
	         JLabel imageLabel = new JLabel(icon);
	         JFrame frame = new JFrame();
	         frame.add(imageLabel);
	         frame.setVisible(true);
	         frame.pack();
	    } catch (MalformedURLException e) {
	         e.printStackTrace();
	    }
	}
 
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed = (JButton) e.getSource();
	if (pressed == button) {
		showPictureFromTheInternet("https://cdn.newsapi.com.au/image/v1/371db93b999855733828710cd445acab?width=650");
	}
	JButton pressed1 = (JButton) e.getSource();
	if (pressed1 == button1) {
		showPictureFromTheInternet("https://i.imgur.com/XPZIN06.jpg");
	}
	
}

}

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame frame = new JFrame();
	JLabel dots = new JLabel();
	JLabel circle = new JLabel();
	String image2 = "yeet the sequel.jpg";
	String image1 = "yeet.jpg";
	private void createBook() {
		// 2. make the frame visible
		frame.setVisible(true);
		// 3. set the size of the frame
		frame.setSize(1000, 1000);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		// 7. use the "loadImage..." methods below to initialize your JLabel
		dots = loadImageFromComputer(image1);
		// 8. add your JLabel to the frame
		frame.add(dots);
		// 9. call the pack() method on the frame
		frame.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("clicked!");
		// 12. remove everything from the frame that was added earlier
		frame.remove(dots);
		// 13. load a new image like before (this is more than one line of code)
		circle = loadImageFromComputer(image2);
		frame.add(circle);
		// 14. pack the frame
		frame.pack();
		JOptionPane.showMessageDialog(null, "haha im an add. pay me to kill me");
		JOptionPane.showMessageDialog(null, " i have ur grandma hostage.  gimme monee");
		JOptionPane.showMessageDialog(null, "John wick is introuble in tilted toweres  gib me sum moneee and he'll be A ok");
		JOptionPane.showMessageDialog(null, "hot girls in your area. gib moi moneysy");
		JOptionPane.showMessageDialog(null, "hahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahaha");
		JOptionPane.showMessageDialog(null, "Wak Дональдс");
		JOptionPane.showMessageDialog(null, "yeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeet");
		JOptionPane.showMessageDialog(null, "im an ad and you'll pay me to get rid of me");
		JOptionPane.showMessageDialog(null, "G E T M E M Y M O N E Y B Y T H U R S D A Y OR E LS E Y O U D I E");
		JOptionPane.showMessageDialog(null, "ur a nerd. so gimme ur lunch money");
		JOptionPane.showMessageDialog(null, "[insert witty pop up]");
		JOptionPane.showMessageDialog(null, "$$$$$$$$$$$$ make insane money in one week if you give me money $$$$$$$$$$");
		JOptionPane.showMessageDialog(null, "ha nerd");
		JOptionPane.showMessageDialog(null, "this will make you cum in miliseconds");
		JOptionPane.showMessageDialog(null, "copyright strike this guy");
		JOptionPane.showMessageDialog(null, "sub 2 pewds");
		JOptionPane.showMessageDialog(null, "дай мне мои деньги ты идиот");
		JOptionPane.showMessageDialog(null, "把你的钱给我白痴");
		JOptionPane.showMessageDialog(null, "hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack ugly hijack man ugly man ugly man ugly man ugly man ug hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack hijack ugly hijack man ugly man ugly man ugly man ugly man ug hiking a traveler fishing man");
		JOptionPane.showMessageDialog(null, "uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo uwu owo ");
		JOptionPane.showMessageDialog(null, "this is the end of the ads");
		JOptionPane.showMessageDialog(null, "lol jkjkjkjkjkjkjkjkjkjkjkjkjkjk :D");
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}



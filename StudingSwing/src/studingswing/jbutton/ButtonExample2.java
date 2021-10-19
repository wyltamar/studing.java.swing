package studingswing.jbutton;

import javax.swing.*;

public class ButtonExample2 {
	
	public ButtonExample2() {

		JFrame frame = new JFrame("Button example 2"); //Creating instance of JFrame
		Icon icon = new ImageIcon("C:\\icons\\pencil.png");
		JButton button = new JButton(icon);
		
		button.setBounds(100, 100, 100, 60);
		
		
		frame.add(button);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

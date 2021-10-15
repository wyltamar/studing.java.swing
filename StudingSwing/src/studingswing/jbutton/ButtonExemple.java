package studingswing.jbutton;

import javax.swing.*;

public class ButtonExemple {

	public static void main(String[] args) {

		JFrame jFrame = new JFrame("Button Exemple"); //creating instance of JFrame
		
		JButton jButton = new JButton("Click Here");//creating instance of JButton
		
		jButton.setBounds(50, 100, 95, 30); // x axis, y axis, width, height
		
		jFrame.add(jButton); //adding the component jButton in jFrame
		
		jFrame.setSize(400, 400);// setting width = 400 and height = 400
		
		jFrame.setLayout(null); // setting layout null
		
		jFrame.setVisible(true); //making the jFrame visible
		
	}

}

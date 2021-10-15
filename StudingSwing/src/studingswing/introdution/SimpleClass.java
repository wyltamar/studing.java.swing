package studingswing.introdution;

import javax.swing.*;

public class SimpleClass {
	
	JFrame jFrame;
	
	public SimpleClass() {
		
		jFrame = new JFrame(); // creating instance of JFrame
		
		JButton jButton = new JButton("Clik "); //creating instance of JButton
		jButton.setBounds(130, 100, 100, 40); //x axis, y axis, width, height
		
		
		jFrame.add(jButton); // adding button in JFrame
		
		jFrame.setSize(400, 500); //400 width and 500 height
		
		jFrame.setLayout(null); //using no layout managers
		
		jFrame.setVisible(true); // make the jFrame visible
	}
	

}

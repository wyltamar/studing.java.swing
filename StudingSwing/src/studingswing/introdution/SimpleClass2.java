package studingswing.introdution;


import javax.swing.*;

public class SimpleClass2 extends JFrame { //inheriting JFrame
	
	
	private static final long serialVersionUID = 1L;
	JFrame jFrame;
	
	public SimpleClass2() {

		JButton jButton = new JButton("Clik "); //creating instance of JButton
		jButton.setBounds(130, 100, 100, 40); //x axis, y axis, width, height
		
		
		add(jButton); // adding button in JFrame
		
		setSize(400, 500); //400 width and 500 height
		
		setLayout(null); //using no layout managers
		
		setVisible(true); // make the jFrame visible

	}
	
	
}

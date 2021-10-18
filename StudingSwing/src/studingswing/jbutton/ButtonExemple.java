package studingswing.jbutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonExemple {

	public static void main(String[] args) {

		JFrame jFrame = new JFrame("Button Exemple"); //creating instance of JFrame
		
		final JTextField jTextField = new JTextField();
		jTextField.setEditable(false);
		
		jTextField.setBounds(50, 50, 150, 25);
		
		JButton jButton = new JButton("Click Here");//creating instance of JButton
		
		jButton.setBounds(50, 100, 95, 30); // x axis, y axis, width, height
		
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextField.setText("Welcome to Javatpoint !!!");
			}
		});
		
		
		jFrame.add(jButton); //adding the component jButton in jFrame
		jFrame.add(jTextField);
		jFrame.setSize(400, 400);// setting width = 400 and height = 400
		jFrame.setLayout(null); // setting layout null
		jFrame.setVisible(true); //making the jFrame visible
		
	}

}

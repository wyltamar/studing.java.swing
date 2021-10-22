package studingswing.jtextfield;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldExemple {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Eample JTextField");
		
		JTextField jTextField = new JTextField("TextField Example");
		jTextField.setBounds(100, 100, 190, 30);
		
		JTextField jTextField2 = new JTextField("Welcome to Java");
		jTextField2.setBounds(100, 150, 190, 30);
		
		frame.add(jTextField);
		frame.add(jTextField2);
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

}

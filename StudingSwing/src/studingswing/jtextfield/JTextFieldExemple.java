package studingswing.jtextfield;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldExemple {
	JTextField jTextField;
	JTextField jTextField2;
	JTextField jTextField3;
	JButton btn1;
	JButton btn2;

	public JTextFieldExemple() {

		JFrame frame = new JFrame("Eample JTextField"); // Creating instance of JFrame

		jTextField = new JTextField(); // Creating instance of JTextField
		// Calling method setBoundas and set axle x, axle y, width, high of component
		// jTextField
		jTextField.setBounds(100, 100, 190, 30);

		jTextField2 = new JTextField();
		jTextField2.setBounds(100, 150, 190, 30);

		jTextField3 = new JTextField();
		jTextField3.setBounds(100, 200, 190, 30);
		jTextField3.setEditable(false);

		btn1 = new JButton("+");
		btn1.setBounds(130, 250, 50, 50);

		btn2 = new JButton("-");
		btn2.setBounds(220, 250, 50, 50);

		frame.add(jTextField);
		frame.add(jTextField2);
		frame.add(jTextField3);

		frame.add(btn1);
		frame.add(btn2);

		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		
		String txt1 = jTextField.getText();
		String txt2 = jTextField2.getText();
		
		int a = Integer.parseInt(txt1);
		int b = Integer.parseInt(txt2);
		int c = 0;
		
		if(e.getSource() == btn1) {
			c = a + b;
		}else {
			if(e.getSource() == btn2) c= a - b;
		}
		
		String result = String.valueOf(c);
		jTextField3.setText(result);
		
		
	}

	public static void main(String[] args) {
		
		new JTextFieldExemple();
	}

}

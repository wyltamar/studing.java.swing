package studingswing.jlabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Closeable;

public class JLabelExample2 extends Frame implements ActionListener {
	
	JTextField tf;
	JLabel lb;
	JButton btn;
	
	public JLabelExample2() {
		
		tf = new JTextField(); //creating instance of JTextField
		tf.setBounds(50, 50, 150, 20);
		
		lb = new JLabel();
		lb.setBounds(50, 100, 250, 20);
		
		btn = new JButton("Find IP");
		btn.setBounds(50, 150, 95, 30);
		btn.addActionListener(this);
		
		add(tf);
		add(lb);
		add(btn);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			lb.setText("IP of "+host+ " is: "+ip);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new JLabelExample2();
	}

}

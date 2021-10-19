package studingswing.jlabel;

import javax.swing.*;
public class JLabelExemple {
	
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("JLabel Example");
		
		JLabel label1 = new JLabel("First Label");
		label1.setBounds(50, 50, 100, 30);
		
		JLabel label2 = new JLabel("Second Label");
		label2.setBounds(50, 50, 100, 100);
		
		
		jFrame.add(label1);
		jFrame.add(label2);
		jFrame.setSize(300, 300);
		jFrame.setLayout(null);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
	}

}

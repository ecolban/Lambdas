package org.jointheleague.lambdas;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class SimpleLeap implements Runnable, ActionListener {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new SimpleLeap());
	}


	@Override
	public void actionPerformed(ActionEvent e) {
			System.out.println("Click!");
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Lambda Test");
		JButton clickButton = new JButton("Click!");
		clickButton.addActionListener(this);
		frame.setLayout(new FlowLayout());
		frame.add(clickButton);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
}

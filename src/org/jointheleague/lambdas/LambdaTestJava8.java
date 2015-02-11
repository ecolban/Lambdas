package org.jointheleague.lambdas;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class LambdaTestJava8 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new LambdaTestJava8().getGoing());
	}

	private void getGoing() {
		String title = "Lambda Test";
		JFrame frame = new JFrame(title);
		JButton clickButton = new JButton("Click!");
		clickButton.addActionListener((e) -> System.out.println(title
				+ ": Click!"));
		frame.setLayout(new FlowLayout());
		frame.add(clickButton);
		JButton doubleClickButton = new JButton("2x Click!");
		doubleClickButton.addActionListener((e) -> System.out.println(title
				+ ": Click! Click!"));
//		title = "Something else";
		frame.add(doubleClickButton);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

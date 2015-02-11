package org.jointheleague.lambdas;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class LambdaTestAnon {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new LambdaTestAnon().getGoing();
			}
		});
	}

	// private JButton clickButton;
	// private JButton doubleClickButton;

	// @Override
	// public void actionPerformed(ActionEvent e) {
	// if(e.getSource().equals(clickButton)) {
	// System.out.println("Click!");
	// } else if(e.getSource().equals(doubleClickButton)) {
	// System.out.println("Click! Click!");
	// }
	//
	// }

	private void getGoing() {
		final String title = "Lambda Test";
		JFrame frame = new JFrame(title);
		JButton oneClickButton = new JButton("1 Click!");
		oneClickButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(title + ": Click!");
			}
		});
		frame.setLayout(new FlowLayout());
		frame.add(oneClickButton);
		JButton twoClickButton = new JButton("2 Click!");
		twoClickButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(title + ": Click! Click!");
			}
		});
//		title = "Something else";
		frame.add(twoClickButton);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

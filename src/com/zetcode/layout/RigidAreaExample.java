package com.zetcode.layout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * RigidAreaExample
 */
public class RigidAreaExample extends JFrame {

	public RigidAreaExample() {
		initUI();
	}

	public final void initUI() {

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.setBorder(new EmptyBorder(new Insets(40, 60, 40, 60)));

		panel.add(new JButton("Button"));
		panel.add(Box.createRigidArea(new Dimension(0, 5)));
		panel.add(new JButton("Button"));
		panel.add(Box.createRigidArea(new Dimension(0, 5)));
		panel.add(new JButton("Button"));
		panel.add(Box.createRigidArea(new Dimension(0, 5)));
		panel.add(new JButton("Button"));

		add(panel);

		pack();

		setTitle("RigidArea");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RigidAreaExample ex = new RigidAreaExample();
				ex.setVisible(true);
			}
		});
	}
}

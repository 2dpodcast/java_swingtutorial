package com.zetcode.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * CheckBoxExample
 */
public class CheckBoxExample extends JFrame implements ActionListener {

	public CheckBoxExample() {
		initUI();
	}

	public final void initUI() {

		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(15, 20)));

		JCheckBox checkbox = new JCheckBox("Show Title", true);
		checkbox.setFocusable(false);
		checkbox.addActionListener(this);
		add(checkbox);

		setSize(280, 200);
		setTitle("JCheckBox example");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JCheckBox source = (JCheckBox) e.getSource();
		boolean state = source.isSelected();

		if (state) {
			this.setTitle("JCheckbox example");
		} else {
			this.setTitle("");
		}
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				CheckBoxExample ex = new CheckBoxExample();
				ex.setVisible(true);
			}
		});
	}
}

package com.zetcode.dialogs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * AboutDialog
 */
class AboutDialog extends JDialog {

	public AboutDialog() {
		initUI();
	}

	public final void initUI() {

		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		add(Box.createRigidArea(new Dimension(0, 10)));

		ImageIcon icon = new ImageIcon("notes.png");
		JLabel label = new JLabel(icon);
		label.setAlignmentX(0.5f);
		add(label);

		add(Box.createRigidArea(new Dimension(0, 10)));

		JLabel name = new JLabel("Notes, 1.23");
		name.setFont(new Font("Serif", Font.BOLD, 13));
		name.setAlignmentX(0.5f);
		add(name);

		add(Box.createRigidArea(new Dimension(0, 50)));

		JButton close = new JButton("Close");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});

		close.setAlignmentX(0.5f);
		add(close);

		setModalityType(ModalityType.APPLICATION_MODAL);

		setTitle("About Notes");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300, 200);
	}
}

package com.zetcode.components;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * ComboBox
 */
public class ComboBox extends JDialog implements ActionListener, ItemListener {

	final String[] authors = {
			"Leo Tolstoy", "John Galsworthy",
			"Honore de Balzac", "Stefan Zweig",
			"Boris Pasternak", "Tom Wolfe"
	};

	final String[] images = {
			"tolstoy.jpg", "galsworthy.jpg", "balzac.jpg",
			"zweig.jpg", "pasternak.jpg", "wolfe.jpg"
	};

	private JLabel display = null;
	private JComboBox combobox = null;
	private JButton button = null;

	ImageIcon icon = new ImageIcon(
			ClassLoader.getSystemResource("balzac.jpg"));

	public ComboBox() {

		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0, 35)));

		display = new JLabel();
		display.setPreferredSize(new Dimension(100, 127));
		display.setMaximumSize(new Dimension(100, 127));
		display.setAlignmentX(Component.CENTER_ALIGNMENT);
		display.setBorder(LineBorder.createGrayLineBorder());
		add(display);

		add(Box.createRigidArea(new Dimension(0, 15)));

		combobox = new JComboBox(authors);
		combobox.setSelectedIndex(-1);
		combobox.setPreferredSize(new Dimension(140, 22));
		combobox.setMaximumSize(new Dimension(140, 22));
		combobox.addItemListener(this);
		add(combobox);

		add(Box.createRigidArea(new Dimension(0, 15)));

		button = new JButton("Close");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.addActionListener(this);
		add(button);

		setTitle("JComboBox");
		setSize(300, 300);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBox();
	}


	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	public void itemStateChanged(ItemEvent e) {

		if (e.getStateChange() == ItemEvent.SELECTED) {
			JComboBox combo = (JComboBox) e.getSource();
			int index = combo.getSelectedIndex();
			System.out.println("./files/img/" + images[index]);
			display.setIcon(new ImageIcon("./files/img/" + images[index]));
		}
	}
}

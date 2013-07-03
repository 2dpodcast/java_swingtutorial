package com.zetcode.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JToolbarExample
 */
public class JToolbarExample extends JFrame {

	public JToolbarExample() {
		initUI();
	}

	public final void initUI() {

		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		menubar.add(file);
		setJMenuBar(menubar);

		JToolBar toolbar = new JToolBar();

		ImageIcon icon = new ImageIcon("./files/img/exit.png");

		JButton exitButton = new JButton(icon);
		toolbar.add(exitButton);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		add(toolbar, BorderLayout.NORTH);

		setTitle("Simple toolbar");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JToolbarExample ex = new JToolbarExample();
				ex.setVisible(true);
			}
		});
	}
}

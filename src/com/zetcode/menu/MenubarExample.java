package com.zetcode.menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * MenubarExample
 */
public class MenubarExample extends JFrame {

	public MenubarExample() {
		initUI();
	}

	public final void initUI() {

		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);

		JMenuItem eMenuItem = new JMenuItem("Exit", new ImageIcon("./files/img/exit.png"));
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		file.add(eMenuItem);

		JMenuBar menubar = new JMenuBar();
		menubar.add(file);
		setJMenuBar(menubar);

		setTitle("Simple menu");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MenubarExample ex = new MenubarExample();
				ex.setVisible(true);
			}
		});
	}
}

package com.zetcode.layout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * BorderLayoutExample
 */
public class BorderLayoutExample extends JFrame {

	public BorderLayoutExample() {
		initUI();
	}

	public final void initUI() {

		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");

		JMenuItem test = new JMenuItem("Test");
		test.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello world!");
			}
		});
		file.add(test);

		menubar.add(file);
		setJMenuBar(menubar);

		JToolBar toolbar = new JToolBar();
		toolbar.setFloatable(false);

		ImageIcon exit = new ImageIcon("./files/img/exit.png");
		JButton bexit = new JButton(exit);
		bexit.setBorder(new EmptyBorder(0, 0, 0, 0));
		toolbar.add(bexit);

		add(toolbar, BorderLayout.NORTH);

		JToolBar vertical = new JToolBar(JToolBar.VERTICAL);
		vertical.setFloatable(false);
		vertical.setMargin(new Insets(10, 5, 5, 5));

		ImageIcon select = new ImageIcon("./files/img/drive.png");
		ImageIcon freehand = new ImageIcon("./files/img/computer.png");
		ImageIcon shapeed = new ImageIcon("./files/img/printer.png");

		JButton selectb = new JButton(select);
		selectb.setBorder(new EmptyBorder(3, 0, 3, 0));

		JButton freehandb = new JButton(freehand);
		freehandb.setBorder(new EmptyBorder(3, 0, 3, 0));
		JButton shapeedb = new JButton(shapeed);
		shapeedb.setBorder(new EmptyBorder(3, 0, 3, 0));

		vertical.add(selectb);
		vertical.add(freehandb);
		vertical.add(shapeedb);

		add(vertical, BorderLayout.WEST);

		add(new JTextArea(), BorderLayout.CENTER);

		JLabel statusbar = new JLabel(" Statusbar");
		statusbar.setPreferredSize(new Dimension(-1, 22));
		statusbar.setBorder(LineBorder.createGrayLineBorder());
		add(statusbar, BorderLayout.SOUTH);

		setSize(350, 300);
		setTitle("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BorderLayoutExample ex = new BorderLayoutExample();
				ex.setVisible(true);
			}
		});
	}
}

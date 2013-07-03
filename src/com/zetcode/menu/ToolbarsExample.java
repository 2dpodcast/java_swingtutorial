package com.zetcode.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ToolbarsExample
 */
public class ToolbarsExample extends JFrame {

	public ToolbarsExample() {
		initUI();
	}

	public final void initUI() {

		JToolBar toolbar1 = new JToolBar();
		JToolBar toolbar2 = new JToolBar();

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		ImageIcon newi = new ImageIcon("./files/img/new.png");
		ImageIcon open = new ImageIcon("./files/img/open.png");
		ImageIcon save = new ImageIcon("./files/img/save.png");
		ImageIcon exit = new ImageIcon("./files/img/exit.png");

		JButton newb = new JButton(newi);
		JButton openb = new JButton(open);
		JButton saveb = new JButton(save);

		toolbar1.add(newb);
		toolbar1.add(openb);
		toolbar1.add(saveb);
		toolbar1.setAlignmentX(0);

		JButton exitb = new JButton(exit);
		toolbar2.add(exitb);
		toolbar2.setAlignmentX(0);

		exitb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		panel.add(toolbar1);
		panel.add(toolbar2);

		add(panel, BorderLayout.NORTH);

		setTitle("Toolbars");
		setSize(360, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ToolbarsExample ex = new ToolbarsExample();
				ex.setVisible(true);
			}
		});
	}
}

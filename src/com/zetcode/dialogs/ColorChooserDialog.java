package com.zetcode.dialogs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ColorChooserDialog
 */
public class ColorChooserDialog extends JFrame {

	private JPanel panel;
	private JPanel display;

	public ColorChooserDialog() {
		initUI();
	}

	public final void initUI() {

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		ImageIcon open = new ImageIcon("./files/img/printer.png");

		JToolBar toolbar = new JToolBar();
		JButton openb = new JButton(open);

		openb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JColorChooser clr = new JColorChooser();
				Color color = clr.showDialog(panel, "Choose Color", Color.white);
				display.setBackground(color);
			}
		});

		toolbar.add(openb);

		display = new JPanel();
		display.setBackground(Color.WHITE);

		panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
		panel.add(display);
		add(panel);

		add(toolbar, BorderLayout.NORTH);

		setTitle("ColorChooserDialog");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ColorChooserDialog ccd = new ColorChooserDialog();
				ccd.setVisible(true);
			}
		});
	}
}

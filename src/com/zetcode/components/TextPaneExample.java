package com.zetcode.components;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * TextPaneExample
 */
public class TextPaneExample extends JFrame {

	JTextPane textPane;

	public TextPaneExample() {
		initUI();
	}

	private void initUI() {

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		JScrollPane pane = new JScrollPane();
		textPane = new JTextPane();

		textPane.setContentType("text/html");
		textPane.setEditable(false);

		textPane.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

		loadFile();

		pane.getViewport().add(textPane);
		panel.add(pane);

		add(panel);
		pack();

		setTitle("JTextPane");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private void loadFile() {

		try {
			String cd = System.getProperty("user.dir") + "/files/";
			System.out.println(cd);
			textPane.setPage("File:///" + cd + "test.html");
		} catch (IOException ex) {
			Logger.getLogger(TextPaneExample.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				TextPaneExample ex = new TextPaneExample();
				ex.setVisible(true);
			}
		});
	}
}

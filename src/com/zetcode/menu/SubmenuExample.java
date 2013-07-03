package com.zetcode.menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * SubmenuExample
 */
public class SubmenuExample extends JFrame {

	public SubmenuExample() {
		initUI();
	}

	public final void initUI() {

		JMenuBar menubar = new JMenuBar();

		ImageIcon iconNew = new ImageIcon("./files/img/new.png");
		ImageIcon iconOpen = new ImageIcon("./files/img/open.png");
		ImageIcon iconSave = new ImageIcon("./files/img/save.png");
		ImageIcon iconExit = new ImageIcon("./files/img/exit.png");

		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);

		JMenu imp = new JMenu("Import");
		imp.setMnemonic(KeyEvent.VK_M);

		JMenuItem newsf = new JMenuItem("Import newsfeed list...");
		JMenuItem bookm = new JMenuItem("Import bookmarks...");
		JMenuItem mail = new JMenuItem("Import mail...");

		imp.add(newsf);
		imp.add(bookm);
		imp.add(mail);

		JMenuItem fileNew = new JMenuItem("New", iconNew);
		fileNew.setMnemonic(KeyEvent.VK_N);

		JMenuItem fileOpen = new JMenuItem("Open", iconOpen);
		fileNew.setMnemonic(KeyEvent.VK_O);

		JMenuItem fileSave = new JMenuItem("Save", iconSave);
		fileSave.setMnemonic(KeyEvent.VK_S);

		JMenuItem fileExit = new JMenuItem("Exit", iconExit);
		fileExit.setMnemonic(KeyEvent.VK_C);
		fileExit.setToolTipText("Exit application");
		fileExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));

		fileExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}

		});

		file.add(fileNew);
		file.add(fileOpen);
		file.add(fileSave);
		file.addSeparator();
		file.add(imp);
		file.addSeparator();
		file.add(fileExit);

		menubar.add(file);

		setJMenuBar(menubar);

		setTitle("Submenu");
		setSize(360, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SubmenuExample ex = new SubmenuExample();
				ex.setVisible(true);
			}
		});
	}
}

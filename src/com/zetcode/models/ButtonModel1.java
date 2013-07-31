package com.zetcode.models;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ButtonModel1
 */
public class ButtonModel1 extends JFrame {

	private JButton ok;
	private JLabel enabled;
	private JLabel pressed;
	private JLabel armed;

	public ButtonModel1() {

		setTitle("ButtonModel1");

		JPanel panel = new JPanel();
		panel.setLayout(null);

		ok = new JButton("ok");
		JCheckBox cb = new JCheckBox("Enabled", true);

		ok.setBounds(40, 30, 80, 25);
		ok.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				DefaultButtonModel model = (DefaultButtonModel) ok.getModel();
				if (model.isEnabled())
					enabled.setText("Enabled: true");
				else
					enabled.setText("Enabled: false");

				if (model.isArmed())
					armed.setText("Armed: true");
				else
					armed.setText("Armed: false");

				if (model.isPressed())
					pressed.setText("Pressed: true");
				else
					pressed.setText("Pressed: false");
			}

		});

		cb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (ok.isEnabled())
					ok.setEnabled(false);
				else
					ok.setEnabled(true);
			}
		});

		cb.setBounds(180, 30, 100, 25);

		enabled = new JLabel("Enabled: true");
		enabled.setBounds(40, 90, 90, 25);
		pressed = new JLabel("Pressed: false");
		pressed.setBounds(40, 120, 90, 25);
		armed = new JLabel("Armed: false");
		armed.setBounds(40, 150, 90, 25);

		panel.add(ok);
		panel.add(cb);
		panel.add(enabled);
		panel.add(pressed);
		panel.add(armed);

		add(panel);

		setSize(350, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonModel1();
	}
}

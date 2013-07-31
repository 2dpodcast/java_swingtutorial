package com.zetcode.models;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ButtonModel2
 */
public class ButtonModel2 extends JFrame {

	private JButton ok;
	private JLabel enabled;
	private JLabel pressed;
	private JLabel armed;

	public ButtonModel2(String title) {
		super(title);
		this.initUI();
	}

	private void initUI() {

		setTitle("ButtonModel1");

		JPanel panel = new JPanel();
		panel.setLayout(null);

		ok = new JButton("ok");
		JCheckBox cb = new JCheckBox("Enabled", true);

		ok.setBounds(40, 30, 80, 25);

		cb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (ok.isEnabled())
					ok.setEnabled(false);
				else
					ok.setEnabled(true);
			}
		});

		cb.setBounds(180, 30, 100, 25);

		enabled = new JLabel("Enabled: true");
		enabled.setBounds(40, 90, 120, 25);
		pressed = new JLabel("Pressed: false");
		pressed.setBounds(40, 120, 120, 25);
		armed = new JLabel("Armed: false");
		armed.setBounds(40, 150, 120, 25);

		ButtonModel model = new DefaultButtonModel() {

			@Override
			public void setEnabled(boolean b) {
				if (b)
					enabled.setText("Enabled: true");
				else
					enabled.setText("Enabled: false");

				super.setEnabled(b);
			}

			@Override
			public void setArmed(boolean b) {
				if (b)
					armed.setText("Armed: true");
				else
					armed.setText("Armed: false");

				super.setArmed(b);
			}

			@Override
			public void setPressed(boolean b) {
				if (b)
					pressed.setText("Pressed: true");
				else
					pressed.setText("Pressed: false");

				super.setPressed(b);
			}
		};

		ok.setModel(model);

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

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ButtonModel2 ex = new ButtonModel2("ButtonModel1");
				ex.setVisible(true);
			}
		});
	}
}

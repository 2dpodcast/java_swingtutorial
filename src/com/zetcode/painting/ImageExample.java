package com.zetcode.painting;

import javax.swing.*;
import java.awt.*;

/**
 * ImageExample
 */
public class ImageExample extends JFrame {

	public ImageExample() {
		initUI();
	}

	public final void initUI() {

		DrawPanel dpnl = new DrawPanel();
		add(dpnl);

		setTitle("Image");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ImageExample ex = new ImageExample();
				ex.setVisible(true);
			}
		});
	}

	class DrawPanel extends JPanel {

		Image img;

		public DrawPanel() {

			loadImage();
			Dimension dm = new Dimension(img.getWidth(null), img.getHeight(null));
			setPreferredSize(dm);
		}

		private void loadImage() {
			img = new ImageIcon("./files/img/texture.png").getImage();
		}

		private void doDrawing(Graphics g) {

			Graphics2D g2d = (Graphics2D) g;

			g2d.drawImage(img, 0, 0, null);
		}

		@Override
		public void paintComponent(Graphics g) {

			super.paintComponent(g);
			doDrawing(g);
		}
	}
}
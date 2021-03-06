package com.zetcode.painting;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * PointsExample
 */
public class PointsExample extends JFrame {

	public PointsExample() {
		initUI();
	}

	public final void initUI() {

		DrawPanel dpnl = new DrawPanel();
		add(dpnl);

		setSize(250, 200);
		setTitle("Points");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class DrawPanel extends JPanel {

		private void doDrawing(Graphics g) {

			Graphics2D g2d = (Graphics2D) g;

			g2d.setColor(Color.blue);

			for (int i = 0; i <= 1000; i++) {

				Dimension size = getSize();
				Insets insets = getInsets();

				int w = size.width - insets.left - insets.right;
				int h = size.height - insets.top - insets.bottom;

				Random r = new Random();
				int x = Math.abs(r.nextInt()) % w;
				int y = Math.abs(r.nextInt()) % h;
				g2d.drawLine(x, y, x, y);
			}
		}

		@Override
		public void paintComponent(Graphics g) {

			super.paintComponent(g);
			doDrawing(g);
		}
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				PointsExample ex = new PointsExample();
				ex.setVisible(true);
			}
		});
	}
}

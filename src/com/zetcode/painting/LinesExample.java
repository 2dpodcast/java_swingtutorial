package com.zetcode.painting;

import javax.swing.*;
import java.awt.*;

/**
 * LinesExample
 */
public class LinesExample extends JFrame {

	public LinesExample() {
		initUI();
	}

	public final void initUI() {

		DrawPanel dpnl = new DrawPanel();
		add(dpnl);

		setSize(280, 270);
		setTitle("Lines");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				LinesExample ex = new LinesExample();
				ex.setVisible(true);
			}
		});
	}

	class DrawPanel extends JPanel {

		private void doDrawing(Graphics g) {

			Graphics2D g2d = (Graphics2D) g;

			float[] dash1 = {2f, 0f, 2f};
			float[] dash2 = {1f, 1f, 1f};
			float[] dash3 = {4f, 0f, 2f};
			float[] dash4 = {4f, 4f, 1f};

			g2d.drawLine(20, 40, 250, 40);

			BasicStroke bs1 = new BasicStroke(1, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND, 1.0f, dash1, 2f);

			BasicStroke bs2 = new BasicStroke(1, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND, 1.0f, dash2, 2f);

			BasicStroke bs3 = new BasicStroke(1, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND, 1.0f, dash3, 2f);

			BasicStroke bs4 = new BasicStroke(1, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND, 1.0f, dash4, 2f);

			g2d.setStroke(bs1);
			g2d.drawLine(20, 80, 250, 80);

			g2d.setStroke(bs2);
			g2d.drawLine(20, 120, 250, 120);

			g2d.setStroke(bs3);
			g2d.drawLine(20, 160, 250, 160);

			g2d.setStroke(bs4);
			g2d.drawLine(20, 200, 250, 200);
		}

		@Override
		public void paintComponent(Graphics g) {

			super.paintComponent(g);
			doDrawing(g);
		}
	}
}

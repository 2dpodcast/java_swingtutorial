package com.zetcode.painting;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Textures
 */
public class Textures extends JFrame {

	public Textures() {
		initUI();
	}

	public final void initUI() {

		DrawPanel dpnl = new DrawPanel();
		add(dpnl);

		setSize(360, 120);
		setTitle("Textures");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Textures ex = new Textures();
				ex.setVisible(true);
			}
		});
	}

	class DrawPanel extends JPanel {

		BufferedImage slate;
		BufferedImage java;
		BufferedImage pane;
		TexturePaint slatetp;
		TexturePaint javatp;
		TexturePaint panetp;

		public DrawPanel() {
			loadImages();
		}

		private void loadImages() {
			try {
				slate = ImageIO.read(this.getClass().getResource("computer.png"));
				java = ImageIO.read(this.getClass().getResource("java.png"));
				pane = ImageIO.read(this.getClass().getResource("pane.png"));
			} catch (IOException ex) {
				Logger.getLogger(Textures.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			doDrawing(g);
		}

		private void doDrawing(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;

			slatetp = new TexturePaint(slate, new Rectangle(0, 0, 90, 60));
			javatp = new TexturePaint(java, new Rectangle(0, 0, 90, 60));
			panetp = new TexturePaint(pane, new Rectangle(0, 0, 90, 60));

			g2d.setPaint(slatetp);
			g2d.fillRect(10, 15, 90, 60);

			g2d.setPaint(javatp);
			g2d.fillRect(130, 15, 90, 60);

			g2d.setPaint(panetp);
			g2d.fillRect(250, 15, 90, 60);
		}
	}
}

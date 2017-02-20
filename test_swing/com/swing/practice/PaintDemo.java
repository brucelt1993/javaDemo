package com.swing.practice;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
/**
 * graphics2D paint
 * @author bruceluo
 *
 */
public class PaintDemo extends JFrame {
	public PaintDemo() {
		setSize(200, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(new GradientPaint(20f, 50f, Color.WHITE, 80f, 80f, Color.red, true));
		g2.fill(new Rectangle2D.Double(20, 50,70, 70));
		BufferedImage textture = new BufferedImage(5, 5, 1);
		Graphics2D pattern = textture.createGraphics();
		pattern.setColor(Color.blue);
		pattern.fillRect(0, 0, 5, 5);
		pattern.setColor(Color.white);
		pattern.fillOval(0, 0, 5, 5);
		Rectangle rect = new Rectangle(0, 0, 5, 5);
		g2.setPaint(new TexturePaint(textture, rect));
		g2.fill(new Rectangle2D.Double(100, 50, 70, 70));
	}
	public static void main(String[] args) {
		PaintDemo pt = new PaintDemo();
	}
}

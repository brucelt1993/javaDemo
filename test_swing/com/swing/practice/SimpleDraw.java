package com.swing.practice;
/**
 * 绘制简易图形
 */
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleDraw {
	public static void main(String[] args) {
		DrawFrame drawFrame = new DrawFrame();
		drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawFrame.setVisible(true);
	}
}

class DrawFrame extends JFrame {
	public DrawFrame() {
		setTitle("简单图形绘制");
		setSize(300, 300);
		DrawPanel panel = new DrawPanel();
		Container contentPane = getContentPane();
		contentPane.add(panel);
	}
}

class DrawPanel extends JPanel {
	@Override
	public void paint(Graphics g) {
		int x1 = 50, y1 = 50, x2 = 50, y2 = 150;
		int radius = 100;
		int startAngle = -90;
		int arcAngle = 180;
		g.drawLine(x1, y1, x2, y2);
		g.drawArc(x1 - radius / 2, y1, radius, radius, startAngle, arcAngle);
		Polygon p = new Polygon();
		x1 += 150;
		y1 += 50;
		radius /= 2;
		for (int i = 0; i < 6; i++) {
			p.addPoint((int) (x1 + radius * Math.cos(i * 2 * Math.PI / 6)),
					(int) (y1 + radius * Math.sin(i * 2 * Math.PI / 6)));
		}
		g.drawPolygon(p);
	}
}
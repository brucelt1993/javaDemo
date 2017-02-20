package com.swing.practice;
/**
 * 简易java2D图形
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MapJFrame extends JFrame{
	public MapJFrame() {
        super("Draw 2D Shape Demo");
        setSize(350,350);
        MapPane map = new MapPane();
        getContentPane().add(map);
	}
	public static void main(String[] args) {
		MapJFrame frame = new MapJFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class MapPane extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		// 建立graphics2D对象
		Graphics2D g2 = (Graphics2D) g;
		// 建立Line2D对象
		Line2D l = new Line2D.Float(1.0f, 2.0f, 150.0f, 20.0f);
		g2.draw(l);
		// 建立Rectangle2D对象
		Rectangle2D r = new Rectangle2D.Float(50, 80, 100, 100);
		Color c = new Color(10, 20, 255);
		g2.setColor(c);
		g2.draw(r);
		// 建立Ellipse2D对象
		Ellipse2D e = new Ellipse2D.Double(200, 180, 100, 100);
		g2.setColor(Color.GRAY);
		g2.fill(e);
		g2.drawString("Java 游戏", 0, 200);
		CubicCurve2D cubic = new CubicCurve2D.Float(0, 100, 120, 50, 170, 270, 220, 50);
		g2.draw(cubic);
	}
}

package com.swing.practice;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
/**
 * graphics2D stroke(画笔)
 * @author bruceluo
 *
 */
public class StrokeDemo extends JFrame{
     public StrokeDemo() {
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
     @Override
    public void paint(Graphics g) {
    	Graphics2D g2 = (Graphics2D) g;
    	//线条
    	Line2D l = new Line2D.Double(30, 50, 100, 80);
    	Stroke stroke = new BasicStroke(10.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL);
    	g2.setStroke(stroke);
    	g2.draw(l);
    	//椭圆
    	Ellipse2D e = new Ellipse2D.Double(150, 50, 90, 90);
    	stroke = new BasicStroke(8,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL,0,new float[]{10,5},0);
    	g2.setStroke(stroke);
    	g2.draw(e);
    	//矩形
    	Rectangle2D r = new Rectangle2D.Double(30, 100, 80, 80);
    	stroke = new BasicStroke(10,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_ROUND,0);
    	g2.setStroke(stroke);
    	g2.draw(r);
    }
     public static void main(String[] args) {
		StrokeDemo sk = new StrokeDemo();
	}
}

package com.swing.practice;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;

public class AddPathExample extends JFrame {
	public AddPathExample() {
		setTitle("GeneralPath Dmeo");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		GeneralPath myPath, myPath2;
		Point[] myArray = { new Point(130, 130), new Point(160, 160), new Point(100, 160), new Point(130, 130) };
		myPath = new GeneralPath();
		myPath.moveTo(myArray[0].x, myArray[0].y);
		for (int i = 1; i < myArray.length; i++) {
			myPath.lineTo(myArray[i].x, myArray[i].y);
		}
		g2.draw(myPath);// 绘制正三角形
		Point[] myArray2 = { new Point(130, 130), new Point(100, 100), new Point(160, 160), new Point(130, 130) };
		myPath2 = new GeneralPath();
		myPath2.moveTo(myArray2[0].x, myArray2[0].y);
		for (int i = 1; i < myArray2.length; i++) {
			myPath2.lineTo(myArray2[i].x, myArray2[i].y);
		}
		g2.draw(myPath2);// 绘制倒正三角形
	}
	public static void main(String[] args) {
		AddPathExample ap = new AddPathExample();
	}
}

package com.brother.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜拳游戏（与电脑竞猜）
 * 
 * @author bruceluo
 *
 */
public class FingerGame {
	public static void main(String[] args) {
		startGame(3);
	}

	/**
	 * @param num
	 */
	public static void startGame(int num) {
		String[] type = { "石头", "剪头", "布" };
		System.out.println("************游戏开始*****************");
		Scanner scanner = new Scanner(System.in);
		int userWin = 0;
		int sysWin = 0;
		while (num > 0) {
			System.out.println("请猜拳:(1:石头，2：剪头，3：布)");
			int userGuse = scanner.nextInt();
			int systemNum = new Random().nextInt(100) % 3 + 1;
			if (userGuse == systemNum) {
				System.out.println("您和电脑同时出" + type[userGuse - 1] + ",打成平手");
			} else if (Math.abs(userGuse - systemNum) == 1) {
				if (userGuse > systemNum) {
					System.out.println("你出拳:" + type[userGuse - 1]);
					System.out.println("电脑出拳:" + type[systemNum - 1] + ",你输了");
					sysWin++;
				} else {
					System.out.println("你出拳:" + type[userGuse - 1]);
					System.out.println("电脑出拳:" + type[systemNum - 1] + ",你赢了");
					userWin++;
				}
			} else {
				if (userGuse > systemNum) {
					System.out.println("你出拳:" + type[userGuse - 1]);
					System.out.println("电脑出拳:" + type[systemNum - 1] + ",你赢了");
					userWin++;
				} else {
					System.out.println("你出拳:" + type[userGuse - 1]);
					System.out.println("电脑出拳:" + type[systemNum - 1] + ",你输了");
					sysWin++;
				}
			}
			num--;
		}
		scanner.close();
		System.out.println("------游戏结果------");
		if (userWin > sysWin){
			System.out.println("恭喜你"+userWin+":"+sysWin+"赢了电脑");
		} else if (sysWin > userWin) {
			System.out.println("遗憾"+userWin+":"+sysWin+"输给了电脑");
		} else {
			System.out.println(userWin+":"+sysWin+"打成平手");
		}
	}
}

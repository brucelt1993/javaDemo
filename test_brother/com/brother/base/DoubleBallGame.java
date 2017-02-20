package com.brother.base;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 双色球小游戏
 * 
 * @author bruce
 *
 */
public class DoubleBallGame {
	public static void startGame() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] sysRedNums = new int[6];// 系统生产的红球
		int[] useRedNums = new int[6];// 用户输入的红球
		int sysBlueNums = random.nextInt(16) + 1;// 系统产生的篮球
		int useBlueNum;// 用户输入的篮球
		int redCount = 0;
		int blueCount = 0;
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32, 33 };
		// 系统产生红球
		for (int i = 0; i < sysRedNums.length; i++) {
			while (true) {
				int randomRed = random.nextInt(33);
				if (numbers[randomRed] != 0) {
					sysRedNums[i] = numbers[randomRed];
					numbers[randomRed] = 0;
					break;
				}
			}
		}
		// 用户输入
		System.out.println("游戏开始：）");
		System.out.println("请输入红球:");
		for (int i = 0; i < useRedNums.length; i++) {
			int red = scanner.nextInt();
			useRedNums[i] = red;
		}
		System.out.println("请输入篮球:");
		useBlueNum = scanner.nextInt();
		if (useBlueNum == sysBlueNums) {
			blueCount++;
		}
		for (int i = 0; i < sysRedNums.length; i++) {
			for (int j = 0; j < useRedNums.length; j++) {
				if (sysRedNums[i] == useRedNums[j]) {
					redCount++;
				}
			}
		}
		// 中奖信息
		if (redCount == 6 && blueCount == 1) {
			System.out.println("中一等奖，300万");
		} else if (redCount == 6) {
			System.out.println("中二等奖，30万");
		} else if (redCount == 5 || (redCount == 4 && blueCount == 1)) {
			System.out.println("中三等奖，5000元");
		} else if (redCount == 4 || (redCount == 3 && blueCount == 1)) {
			System.out.println("中四等奖，300元");
		} else if (redCount == 3 || (redCount == 2 && blueCount == 1)) {
			System.out.println("中五等奖，10元");
		} else if (blueCount == 1) {
			System.out.println("中六等奖，5元");
		} else {
			System.out.println("抱歉，没有中奖，欢迎下期购买");
		}
		int temp;
		for (int i = 0; i < sysRedNums.length; i++) {
			for (int j = 0; j < sysRedNums.length - 1 - i; j++) {
				if (sysRedNums[j] > sysRedNums[j + 1]) {
					temp = sysRedNums[j];
					sysRedNums[j] = sysRedNums[j + 1];
					sysRedNums[j + 1] = temp;
				}
			}
		}
		// 公布本期号码
		System.out.println("本期中奖号码如下:");
		System.out.println("红球:" + Arrays.toString(sysRedNums));
		System.out.println("篮球:" + sysBlueNums);
		scanner.close();
	}

	public static void main(String[] args) {
		startGame();
	}
}

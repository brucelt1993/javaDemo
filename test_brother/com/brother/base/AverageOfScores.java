package com.brother.base;
import java.util.Arrays;
import java.util.Random;
/**
 * 二维数组的简单应用
 */
import java.util.Scanner;

public class AverageOfScores {
	public static void getScores(int m, int n) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int[][] studentScores = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				Random random = new Random();
				int a = random.nextInt(5)+5;
				int b = random.nextInt(10);
				int num = Integer.parseInt(""+a+b);
				//System.out.println("请输入第" + (i + 1) + "个班级第" + (j + 1) + "为同学的成绩:");
				//int score = scanner.nextInt();
				studentScores[i][j] = num;
			}
		}
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < studentScores.length; i++) {
			int[] arr1 = studentScores[i];
			for (int j = 0; j < arr1.length; j++) {
				int aa = arr1[j];
				if(i==studentScores.length-1 && j==arr1.length-1){
					sBuilder.append(aa);
				}else {
					sBuilder.append(aa+",");
				}
				//System.out.println("该同学的成绩是:" + aa);
				sum += aa;
			}
		}
		String[] str = sBuilder.toString().split(",");
		int[] allScores = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			allScores[i] = Integer.parseInt(str[i]);
		}
		isContains(allScores, 68);
		System.out.println("年级平均分为" + (sum / m / n));
		bubbleSort(allScores);
		//System.out.println(sBuilder.toString());
		scanner.close();
	}
	/*
	 * 简易冒泡算法
	 */
    public static void bubbleSort(int[] arr){
    	int temp;
    	for(int i=0;i<arr.length;i++){
    		for(int j=0;j<arr.length-1-i;j++){
    			if(arr[j]>arr[j+1]){
    				temp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = temp;
    			}
    		}
    	}
    	System.out.println("成绩排序");
    	System.out.println(Arrays.toString(arr));
    }
    /*
     * 猜成绩
     */
    public static void isContains(int[] arr, int m){
    	boolean flag = false;
    	for (int i : arr) {
			if(i==m){
				flag = true;
				break;
			}
		}
    	if(flag){
    		System.out.println("该成绩存在");
    	}else {
			System.out.println("抱歉，该成绩查询么有");
		}
    }
    /*
     * 打印字母菱形
     */
    public static void  printTrangel(char[] cr){
    	for (int i = 0; i < cr.length; i++) {
			for(int j=i;j<cr.length;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++){
				System.out.print(cr[i]);
			}
			System.out.println();
		}
    	for(int i=0;i<cr.length-1;i++){
    		for(int j=0;j<=i+1;j++){
    			System.out.print(" ");
    		}
    		for(int k=0;k<=(cr.length-2-i)*2;k++){
    			System.out.print(cr[cr.length-2-i]);
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		getScores(3, 20);
		char[] cr = {'A','B','C','D','E'};
		printTrangel(cr);
	}
}

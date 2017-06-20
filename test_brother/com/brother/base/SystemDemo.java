package com.brother.base;

import java.io.IOException;
import java.util.Arrays;

public class SystemDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 12, 5, 8, 9 };
		int[] arr1 = new int[3];
		System.arraycopy(arr, 3, arr1, 0, 3);
		System.out.println(Arrays.toString(arr1));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.home"));
		Runtime run = Runtime.getRuntime();
		//可用内存
		System.out.println(run.freeMemory()/1024/1024+"MB");
		System.out.println(run.totalMemory()/1024/1024+"MB");
		try {
			run.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

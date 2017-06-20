package com.brother.base;

public class LambdaDemo {
     public static void main(String[] args) {
		IEat e1 = (num)->num;
		System.out.println(e1.num(10));
	}
}
interface IEat{
	public int num(int num);
}

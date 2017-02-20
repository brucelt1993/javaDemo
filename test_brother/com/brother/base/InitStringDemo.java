package com.brother.base;

public class InitStringDemo {
    public static void main(String[] args) {
        String s2 = "acb";
        String s1 = new String("acb");
        String s3 = "ac"+"b";
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));
	}
}

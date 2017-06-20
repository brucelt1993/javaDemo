package com.Dmeo.myspce;

import org.junit.Test;

public class TestAlgorithm {
	@Test
	public  void testxymod(){
		System.out.println(xymod(12, 3));
	}
	public static int xymod(int a, int b) {
		if(a<b){
			int temp = a;
			a=b;
			b=temp;
		}
		if(0==b){
			return a;
		}
		return xymod(a-b, b);
	}
}

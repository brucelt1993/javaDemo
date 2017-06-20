package com.brother.base;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalDemo {
    public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("345.4343434231");
		BigDecimal b2 = new BigDecimal("45.1244423");
		System.out.println(b1.scale()-b2.scale());
		System.out.println(b1.divide(b2,5,BigDecimal.ROUND_HALF_EVEN));
		
	}
}

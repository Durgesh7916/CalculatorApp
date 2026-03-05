package com.msedcl.main;

import com.msedcl.main.util.CalculatorUtil;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorUtil  calutil=new CalculatorUtil();
		System.out.println("Addition="+calutil.addition(10,20));
		System.out.println("substraction="+calutil.substraction(10,20));

	}

}

package com.bytebank.test;

public class TestWrappers{
	public static void main(String[] args){
		Double numDouble = 33.0; 	//autoboxing
		Boolean valBoolean = true; 	//autoboxing
		
		Double numDouble2 = Double.valueOf(33);
		System.out.println(numDouble2);
		
		String valString = "43"; //autoboxing
		Double strDouble = Double.valueOf(valString);
		Integer strInteger = Integer.valueOf(valString);
		
		System.out.println(strDouble);
		System.out.println(strInteger);
		
		Number numero = Integer.valueOf(5);
		double numdouble = numero.doubleValue(); //Unboxing
		
		Boolean falso = Boolean.FALSE;
		
	}
}
package com.basics;

public class DataTypes {

	public static void main(String[] args) {
		// Primitive data types
		System.out.println("The below are the primitive data types in java");
		byte b=109;
		short s=1242;
		int i=53455;
		long l=85463;
		float f=12.6f;
		double d=634.3646;
		boolean bFlag=true;
		char c='n';
		System.out.println("Byte value is : " + b);
		System.out.println("Short value is : " + s);
		System.out.println("Integer value is : " + i);
		System.out.println("Long value is : " + l);
		System.out.println("Float value is : " + f);
		System.out.println("Double value is : " + d);
		System.out.println("Boolean value is : " + bFlag);
		System.out.println("Char value is : " + c);
		
		byte b1=126;
		int i1=b1; // Widening Type casting/Implicit Type casting :Converting smaller data type to larger type (byte -> short -> char -> int -> long -> float -> double)
		System.out.println(b1 + " " + i1);
		
		int i2 = 129;
		byte b2=(byte)i2; // Narrowing Type casting/Explicit Type casting :Converting bigger data type to smaller type (double -> float -> long -> int -> char -> short -> byte)
		System.out.println(i2 + " " + b2);
		
		// Non Primitive types
		String str = "hello";
		System.out.println(str);
		System.out.println("Length of the given string is : " + str.length());
		System.out.println("Length of the given string is :".concat(" ") + str.length());
		
		
		
	}
}

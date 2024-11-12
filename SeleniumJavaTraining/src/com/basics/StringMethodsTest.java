package com.basics;

public class StringMethodsTest {

	public static void main(String[] args) {
		String s = "hello world";
		String str = "WELCOME TO JAVA SE";
		String sText = "          This is java online training for Selenium           ";
		System.out.println(s.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf('e'));
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.contains("world"));
		System.out.println(s.equals("hello world"));
		System.out.println(sText);
		System.out.println(sText.trim());
		System.out.println(str.replace("SE", "CORE"));
	}
}

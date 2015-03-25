package oop.polymorphism;

public class StringApi {

	public static void main(String[] args) {
		String std="My name is Rajib";
		String std1="M like Cricket";
		
//		System.out.println(std.length());
//		System.out.println(std.trim());
//		System.out.println(std.toLowerCase());
//		System.out.println(std.toUpperCase());
//		System.out.println(std.charAt(6));
//		System.out.println(std.codePointAt(1));
		System.out.println(std.compareTo(std1));
		System.out.println(std.concat(std1));
		System.out.println(std.hashCode());
		System.out.println(std.indexOf(0));
		System.out.println(std);

	}

}

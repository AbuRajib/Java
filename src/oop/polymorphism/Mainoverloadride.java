package oop.polymorphism;

public class Mainoverloadride {

	public static void main(String[] args) {
		
		Overloading overloading=new Overloading();
		System.out.println("RAM Space in GB:"+overloading.ram(2, 2));
		System.out.println("RAM Space in GB:"+overloading.ram(2, 1, "GB"));
		
		ExtendsOverloading extendsoverriding=new ExtendsOverloading();
		System.out.println("RAM Space from Extends:" +extendsoverriding.ram(5, 5, 5));
		
	}

}

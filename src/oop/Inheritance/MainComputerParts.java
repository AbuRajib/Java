package oop.Inheritance;

public class MainComputerParts {

	public static void main(String[] args) {
		
		ComputerParts computerparts=new ComputerParts();
		computerparts.Harddisk();
		
		ExtendsComputer extendscomputer=new ExtendsComputer();
		extendscomputer.monitor();
		extendscomputer.ROM();
	}

}

package oop.abstraction;

public class MainComputer {

	public static void main(String[] args) {
		
		Computer computer=new DesktopComputer();
		computer.Desktop_computer();
		
		ComputingDevice computingdevice=new DesktopComputer();
		computingdevice.Ram();
		
		DesktopComputer desktopcomputer=new DesktopComputer();
		desktopcomputer.Cpu();
		desktopcomputer.Laptop_computer();
	}

}

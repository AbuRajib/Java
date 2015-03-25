package oop.Encapsulation;

public class MainDesktop {

	public static void main(String[] args) {
		
		DesktopAssemble desktopassemble=new DesktopAssemble();
		
		desktopassemble.setProduct_id(101);
		desktopassemble.setRam("4.00 GB");
		desktopassemble.setProcessor("2.4 GZ");
		desktopassemble.setPowersupply("AC convert to DC");
		
		System.out.println("Prodect Id Number: "+desktopassemble.getProduct_id());
		System.out.println("Random Access Memory: "+desktopassemble.getRam());
		System.out.println("CPU/Processor: "+desktopassemble.getProcessor());
		System.out.println("Function of Power Supply: "+desktopassemble.getPowersupply());

	}

}

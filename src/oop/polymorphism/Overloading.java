package oop.polymorphism;

public class Overloading {
	
	public int ram(int x,int y){
		int total=x+y;
		
		return total;
	}
	
	public int ram(int x,int y,int z){
		int total=x+y+z;
		
		return total;
	}
	
	public int ram(int x,int y,String z){
		int total=x+y;
		
		return total;
	}
	
	public int ram(int x,int y,int z,int k){
		int total=x+y+z+k;
		
		return total;
	}

}

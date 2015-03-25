package conditional;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int[] numbers=new int[7];
		
		Scanner sc=new Scanner(System.in);
		
		for(int j=0;j<numbers.length;j++){
				numbers[j]=sc.nextInt();
			}
		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
			
		}
	}

}

package Assignment1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int table = sc.nextInt();
		System.out.println(".............................................");
//		:::Using For Loop:::
		System.out.println(":::Using For Loop:::");
		for (int i=1;i<=12;i++) {
			System.out.println(table +" * "+i+" = "+table*i);
		}
		System.out.println(".............................................");
//		:::Using While Loop:::
		System.out.println(":::Using While Loop:::");
		int z= 1;
		while(z<=12) {
			
			System.out.println(table +" * "+z+" = "+table*z);
			z++;

		}
				
	}

}

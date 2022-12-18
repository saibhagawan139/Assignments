package Assignment1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner value = new Scanner(System.in);
		System.out.println("Please enter a value in rupees to convert into paise :");
		int rupee = value.nextInt();
		int paise = rupee*100;
		System.out.println(paise);
	}
	
	
			
}

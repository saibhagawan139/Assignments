package Assignment1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Add any number to check the number is B/W 11 and 23 :");
		float Value = sc.nextFloat();
		if (Value >= 11 && Value <= 23) {
			System.out.println("Given value is between 11 and 23 :" + Value);
		} else {
			System.out.println("Given value is out of range :" + Value);

		}

	}

}

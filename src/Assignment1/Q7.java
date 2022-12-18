package Assignment1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial=factorial*i;
        }
        System.out.printf("Factorial of %d : %d",num, factorial);
    }
	}


package Assignment1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		int num, x, sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		num = sc.nextInt();  
		while(num > 0)  
		{  
		x = num % 10;		//finds the last digit of the given number    
		sum = sum + x;			//adds last digit to the variable sum
		num = num / 10;	//removes the last digit from the number   
		}   
		System.out.println("Sum of Digits: "+sum);  
		}  
	}



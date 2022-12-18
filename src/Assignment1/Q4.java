package Assignment1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner fahren = new Scanner(System.in);
		System.out.println("Please provide te value in Fahrenheit :");		//Example: (50°F - 32) x .5556 = 10°C
		int f = fahren.nextInt();
		int s = 32;
		float m = 0.556f;			//5/9 = 0.5556
		float fc = (f-s)*m;
		System.out.println("Temperature :" + fc +"°C");
		System.out.println(".........................................");
		
		Scanner Celsius = new Scanner(System.in);
		System.out.println("Please provide te value in Celsius :");			//Example: (30°C x 1.8) + 32 = 86°F
		int C = Celsius.nextInt();
		float n = 1.8f;
		float cf = (C*n)+s;
		System.out.println("Temperature :" + cf +"°F");
		
		

	}

}

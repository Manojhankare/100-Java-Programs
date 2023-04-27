//package aa11_Factorial_of_No;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i, fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.: ");
		i = sc.nextInt();
		sc.close();

		if (i < 0) {
			System.out.println("Number should be positive.");
		} else {
			for (int m = 1; m <= i; m++) {
				fact = fact * m;
			}
			System.out.println("Factorial of given no is " + fact);
		}
	}
}

//package aa11_Factorial_of_No;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialForLargeNo {
	// Finding Factorial of Large numbers

	public static void main(String[] args) {
		int i;

		BigInteger fact = new BigInteger("1"); // Or BigInteger.ONE

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no : ");

		i = sc.nextInt();

		sc.close();

		for (int n = 1; n <= i; n++) {
			fact = fact.multiply(BigInteger.valueOf(n));
		}
		System.out.println("Factorial of given no is " + fact);
	}

}

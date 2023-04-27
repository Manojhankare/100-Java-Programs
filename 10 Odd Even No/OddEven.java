//package aa10_Odd_Even_No;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find out it's odd or even");
		int i = sc.nextInt();
		sc.close();

		if (i % 2 == 0) {
			System.out.println("Number is Even");

		} else {
			System.out.println("Number is Odd");
		}

	}

}

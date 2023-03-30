//package a06_Largest_No;

import java.util.Scanner;

public class LargestNo {

	// finding the largest no among given 3 using If-else loop
	public static void main(String[] args) {

		int i, j, k;
		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter three numbers to find largest of them.");
		i = scan.nextInt();
		j = scan.nextInt();
		k = scan.nextInt();

		scan.close();

		if (i > j && i > k) {
			System.out.println(" Largest no is " + i);
		} else if (j > i && j > k) {
			System.out.println(" Largest no is " + j);
		} else if (k > i && k > j) {
			System.out.println(" Largest no is " + k);
		} else {//if All three numbers are same then..
			System.out.println("Entered numbers are not distinct.");
		}
	}
}

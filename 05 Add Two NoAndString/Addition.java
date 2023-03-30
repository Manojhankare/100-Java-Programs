//package a05_Add_Two_NoandString;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		// will find sum of two integer and sum of one integer and String..

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Variables a as intger");
		int a = sc.nextInt();

		System.out.println("Enter Your Variables b as intger");
		int b = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Your Variables c as String");
		String c = sc.nextLine();

		System.out.println(" Addtion of a+b is = " + a + b);

		System.out.println(" Addtion of a+c is = " + a + c); //see the difference with string + integer 

		sc.close();
	}

}

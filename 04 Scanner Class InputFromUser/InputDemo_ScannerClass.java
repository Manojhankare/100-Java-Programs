//package a04_Scanner_Class_InputFromUser;

import java.util.Scanner;

public class InputDemo_ScannerClass {
	
	public static void main(String[] args) {
		int a;
		String b;
		Float c;
		
		Scanner sc = new Scanner(System.in); //Scanner Class object initializing and getting input from system i.e.Keyboard.
		
		System.out.println("Enter first Variable Value as integer :");
		a=sc.nextInt();
		
		sc.nextLine(); // to find new line
		System.out.println("Enter second variable value as String :");
		b=sc.nextLine();
		
		System.out.println("Enter third variable value as float");
		c=sc.nextFloat();
		
		System.out.println("Your input Variables are :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		sc.close(); //Scanner close
	}

}

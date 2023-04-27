//package aa08_Fahrenheit_To_Celsius;

import java.util.Scanner;

public class FahrenheitToCelsius {
	// Program to convert temperature unit Fahrenheit to Celsius

	//Creating a method to Convert 
	public static double FToC ( double t){
		double c = ((t-32)*5)/9;		
		return c;
		}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit : ");
		double t = sc.nextDouble();
		sc.close();
		
		System.out.println("Temperature in Degree Celsius : ");
		t=FToC(t);
		System.out.println(t);

	}

}

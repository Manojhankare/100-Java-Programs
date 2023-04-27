//package aa09_IF_Else_Loop;

import java.util.Scanner;

public class IfElseDemo {
	// If marks obtain is greater than passing marks then it should print Result as pass 
	// Else Result as fail
	
	public static void main(String[] args) {
		
		double passmarks, obtainmarks;
		passmarks = 45;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Obtain marks : ");
		obtainmarks= sc.nextDouble();
		sc.close();
		
		if (obtainmarks > passmarks ) {
			System.out.println("Student is passed the Exam");
		}
		else {
			System.out.println(" Student is failed the Exam");
		}
	}
}

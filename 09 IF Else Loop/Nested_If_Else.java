//package aa09_IF_Else_Loop;

import java.util.Scanner;

public class Nested_If_Else {
	// grading marks system using IfElse
	// Nested loops means loop in another loop

	public static void main(String[] args) {

		double passmarks = 35;

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Obtain Marks : ");
		double obtainmarks = sc.nextDouble();
		sc.close();

		if (obtainmarks > passmarks) {
			if (obtainmarks > 90) {
				System.out.println("Congratulations!! You have Secured A grade.. ");
			} else if (obtainmarks > 75) {
				System.out.println("Congratulations!! You have Secured b grade.. ");
			} else if (obtainmarks > 50) {
				System.out.println("Congratulations!! You have Secured c grade.. ");
			} else if (obtainmarks > 35) {
				System.out.println("Congratulations!! You have Secured d grade.. ");
			}
		} else {
			System.out.println("Sorry!! Better Luck next time.. ");
		}

	}
}

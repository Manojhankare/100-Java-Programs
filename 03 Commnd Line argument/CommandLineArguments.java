//package a03_Command_Line_Argument;

public class CommandLineArguments {

	public static void main(String[] args) {
//		To add your own command line arguments follow below steps
//		Click on Run in your IDE/s -> Run Configurations.
//		Click on Arguments tab.
//		In Program Arguments section , Enter your arguments.
//		Click Apply/Run.
//		To print those arguments use "args" keyword as we have used follows:

		System.out.println("Number of Command Line Argument = " + args.length);
		for (int i = 0 ; i < args.length; i++) {
			System.out.println(String.format("Command Line Argument %d is %s",i, args [i]));

		}
		System.out.println(" ");
		for (String t : args) {
			System.out.println(t);
		}
	}
}

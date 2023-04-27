//package a07_SwapNo;

public class SwapingWithoutThirdVariable {

	// swapping values of two Variables Without using 3rd variable.

	public static void main(String[] args) {

		// Before Swapping
		int i = 55;
		int j = 23;

		System.out.println(" Before Swapping : \n    i = " + i + "\n    j = " + j);
		i = i + j;
		j = i - j;
		i = i - j;

		System.out.println("\n After Swapping : \n    i = " + i + "\n    j = " + j);

	}

}

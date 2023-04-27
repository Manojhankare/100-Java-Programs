//package a07_SwapNo;

public class SwapingUsingThirdVariable {
	//swapping values of two Variables using 3rd variable.. here used as Temporary Variable

	public static void main(String[] args) {
		// Before Swapping
		int i = 55;
		int j = 23;
		int temp = 0; // Creating third temporary variable

		System.out.println("Before Swapping : \n i = " + i + "\n j = " + j);
		temp = i;
		i = j;
		j = temp;

		System.out.println("\n After Swapping : \n i = " + i + "\n j = " + j);
//System.out.println(temp);

	}

}

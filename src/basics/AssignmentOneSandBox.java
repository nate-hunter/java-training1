package basics;

public class AssignmentOneSandBox {

	public static void main(String[] args) {
		System.out.println("------Problem 1------");
		// (1) Write a function that takes a value n returns the sum of numbers 1 to n
		System.out.println(sumFunction(9));
		
		System.out.println("------Problem 2------");
		// (2) Write a function that computes the factorial value
		// Definition: n! = n*(n-1)! , where 0! = 1
		//		1! = 1
		//		2! = 2 * 1! = 2 * 1
		//		3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
		//		4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
		//		Hint: use the recursive method that was used to calculate Fibonnaci number
		System.out.println(factorialValue(5));
		
		System.out.println("------Problem 3------");
		// (3) Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
		// Hint: this should be static functions with a return type of the same data type as the array declaration.
		int[] arr = {2, 15, 2, 3, 8, 9};
		System.out.println(minArrayValue(arr));
		System.out.println(maxArrayValue(arr));
		System.out.println(avgArrayValue(arr));
	}
	
//	static int sumFunctionFib(int n){
//		if (n == 0){
//			return 0;
//		} else if (n == 1) {
//			return 1;
//		} else {
//			return sumFunctionFib(n - 1) + sumFunctionFib(n - 2);
//		}				
//	}
	
//	static int sumFunction(int num) {
//		int sum = 0;
//		for (int i = 1; i <= num; i++){
////			int x = 0;
////			System.out.print(x + " // " + i);
////			x = i;
//			sum += i;
//			System.out.println(" + " + i + " = " + sum);
//		}
//		return sum;
//	}
	
	// recursive way:
	public static int sumOfNum(int n) {
	    if (n == 0) {
	        return 0;
	    } else
	        return (n + sumOfNum(n - 1));
	}
	
	static int sumFunction(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++){
			sum += i;
		}
		return sum;
	}
	
	static int factorialValue(int n) {
		// Definition: n! = n*(n-1)! , where 0! = 1
		//		1! = 1
		//		2! = 2 * 1! = 2 * 1
		//		3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
		//		4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1			
		if (n == 0) {
			return 1;
		} else if (n == 1){
			return 1;
		} else {
			return n * factorialValue(n - 1);
		}
	}
	
	static int minArrayValue(int[] array) {
		int lowValue = array[0];
		System.out.println("Starting LOW value: " + lowValue);
		for(int i = 0; i < array.length; i++){
			if (array[i] <= lowValue){
				lowValue = array[i];
			}
		}
		return lowValue;
	}
	
	static int maxArrayValue(int[] array) {
		int highValue = array[0];
		System.out.println("Starting HIGH value: " + highValue);
		for(int i = 0; i < array.length; i++) {
			if (array[i] > highValue) {
				highValue = array[i];
			}
		}
		return highValue;
	}
	
	static double avgArrayValue(int[] array) {
		double sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}	
		System.out.println("Average of Array = " + sum + " / " + array.length);
		return sum / array.length;
	}
	
	//---- end of main()
}

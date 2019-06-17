package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonacci number/sequence is defined	by the sum of the previous Fibonacci numbers, eg:
		// fib(0) = 0;
		// fib(1) = 1;
		// fib(2) = fib(0) + fib(1) = 0 + 1 = 1;
		// fib(3) = fib(1) + fib(2) = 1 + 1 = 2;
		// fib(4) = fib(2) + fib(3) = 1 + 2 = 3;
		// fib(5) = fib(3) + fib(4) = 2 + 3 = 5;
		// fib(6) = fib(4) + fib(5) = 3 + 5 = 8;
		// fib(7) = fib(5) + fib(6) = 5 + 8 = 13;
		// fib(8) = fib(6) + fib(7) = 8 + 13 = 21;
		// fib(9) = fib(7) + fib(8) = 13 + 21 = 34;
		// fib(10) = fib(8) + fib(9) = 21 + 34 = 55;
		
//		fib(10);
		System.out.println(fibRecursion(10));
	}

	// so we want a method that will take in arguments? I don't think so. Maybe it can take an arugument to decide how long the sequence should run for.
	static void fib(int arrayLength){
		int fibSequence[] = new int[arrayLength];
		fibSequence[0] = 0;
//		fibSequence[1] = 1;
		
		int num1 = 0;
		int num2 = 1;
		int fibSum = 0;
		
	
		for(int i = 1; i < fibSequence.length; i++) {
//			num1 += num2;
//			num2 = num1;
			fibSum = num1 + num2;
			fibSequence[i] = fibSum;
			System.out.print(i + "(" + fibSum + ")" + " // ");
		}
		
//		for (int i = 0; i < fibSequence.length; i++) {
//			for (int j = 1; i < j; j++) {
////				fibSum = fibSequence[i] + fibSequence[j];
////				fibSum = fibSequence[j+1];
//				System.out.print(fibSequence[i] + " // " + fibSequence[j] + "(" + (fibSequence[i] + fibSequence[j]) + ") :: ");
////				System.out.print(i + "(" + fibSum + ")" + " // ");
//			}
//		}
		
//		System.out.println(fibSequence[0]);
//		System.out.println(fibSum);
	}
	
	static int fibRecursion(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} 
		return (fibRecursion(n-1) + fibRecursion(n-2));		
	}
	
}

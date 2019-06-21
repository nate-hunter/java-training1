package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {30, 25, 433, 26, 73, 132, 5};
		int[] sortedNumbers = {5, 9, 12, 26, 29, 35, 39, 45, 49, 51, 57, 66, 73, 82, 89, 94};
		
		// Call a linear search function that searches for a specific number/its position
		int pos = algorithms.Search.linearSearch(numbers, 11);
		System.out.println(pos);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		
		// Call a binary search function
//		int binPos = algorithms.Search.binarySearch(sortedNumbers, 73, 0, sortedNumbers.length - 1);
//		System.out.println("Found at position: " + binPos);
		
		// Call the bubble sort function
		algorithms.Sort.bubbleSort(numbers);
//		int bubSrt = algorithms.Sort.bubbleSort(numbers);
	}

}

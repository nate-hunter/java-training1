package algorithms;

public class Sort {

	public static void bubbleSort(int[] dataSet){
		System.out.println("\nOriginal Array:\n");
		printArr(dataSet);
		boolean swapped;
		
		do {
			swapped = false;
			for(int i = 0; i < dataSet.length-1; i++) {
				if (dataSet[i] > dataSet[i+1]) {
					int temp = dataSet[i];
					dataSet[i] = dataSet[i+1];
					dataSet[i+1] = temp;
					printArr(dataSet);
					System.out.println(swapped + " | ");
					swapped = true;					
				}
			}
		} while (swapped);
		
	}
	
	private static void printArr(int[] arr){
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}

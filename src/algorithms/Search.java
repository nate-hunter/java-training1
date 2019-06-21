package algorithms;

public class Search {

	// iterate through dataset to search for target
	public static int linearSearch(int[] dataSet, int target) {
		for(int i = 0; i < dataSet.length; i++) {
			if (dataSet[i] == target) {
				return i;
			} 
		}
		return -1;		
	}
	
	// binary search assumes a sorted array and can therefore continually  split our search domain in half
	public static int binarySearch(int[] dataSet, int target, int start, int end){
		System.out.println("Searching between: " + dataSet[start] + " & " + dataSet[end]);
		int middle = (int) Math.floor((start + end) / 2);
		int value = dataSet[middle];
//		System.out.println("start: " + start);
//		System.out.println("end: " + end);
//		System.out.println("middle: " + middle);
//		System.out.println("target: " + target);
//		System.out.println("value: " + value);
//		System.out.println("---------------------------------------");
		boolean numExist = false;
		
		if (dataSet.length > 0) {
			for (int num : dataSet) {
				if(num == target){
					numExist = true;
				}
			}
		}
		
		if (numExist){
			if (target > value) {
				System.out.println(target + " > " + value);
				return binarySearch(dataSet, target, middle + 1, end);
			} else if (target < value) {
				System.out.println(target + " < " + value);
				return binarySearch(dataSet, target, 0, middle - 1);
			}
		} else {
			return -1;
		}

		
//		if (target > value) {
//			System.out.println(target + " > " + value);
//			return binarySearch(dataSet, target, middle + 1, end);
//		} else if (target < value) {
//			System.out.println(target + " < " + value);
//			return binarySearch(dataSet, target, 0, middle - 1);
//		}
		
//		System.out.println("target: " + target);
//		System.out.println("start: " + start);
//		System.out.println("end/length of array: " + end);
//		System.out.println("value: " + value);
//		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		return middle;
	}

}

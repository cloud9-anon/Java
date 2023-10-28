package practise1;

import java.util.ArrayList;
import java.util.List;

public class Common {
	
	
	public static List<Integer> commonPairs(int[] arr1, int[] arr2) {	
		int first = 0;
		int second = 0;
	List<Integer> commonElements = new ArrayList<Integer>();
		while (first < arr1.length && second < arr2.length) 
		{
			if(arr1[first]==arr2[second]) {
				commonElements.add(arr1[first]);
				first++;
				second++;}
			else if(arr1[first]<arr2[second]) {
				first++;}
			else {second++;}
		}
	
			
	return commonElements; }
	
	
	public static void main(String[] args) {
		int[] array1 = {1,5,11,14,16,20,22,28};
		int[] array2 = {2,12,16,21,26,30,35};
		
		
		List<Integer> common = commonPairs(array1, array2);
		for(int i : common) {
			System.out.println(i);
		}
	}

}

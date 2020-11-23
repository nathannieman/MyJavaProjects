/*****************************************
* Author : Nathan Nieman
* Date : 11/4/2020
* Assignment: LabArraysClass
******************************************/
import java.util.Arrays;

public class LabArraysClass 
{
	public static void main(String[] args)
	{
		int[] iArray1 = {6, 12, 3, 9};
		int[] iArray2 = new int[5];
			
		Arrays.fill(iArray2, 7);
		
      System.out.printf("iArray1: %s%n", Arrays.toString(iArray1));
      
      System.out.printf("iArray2: %s%n", Arrays.toString(iArray2));
      System.out.printf("9 in iArray1: %s%n", Arrays.binarySearch(iArray1, 9));
      
      Arrays.sort(iArray1);
      System.out.printf("iArray1 sorted: %s%n", Arrays.toString(iArray1));
		System.out.printf("9 in iArray1: %s%n", Arrays.binarySearch(iArray1, 9));
		
      int[] iArray3 = Arrays.copyOf(iArray1, 3);
      
      System.out.printf("iArray3: %s%n", Arrays.toString(iArray3));		
      System.out.printf("iArray3 equals [3, 6, 9]: %s%n", Arrays.equals(iArray3, new int[] {3, 6, 9}));    
      System.out.println("Reason: If the range contains multiple elements with the specified value, there is no guarantee which one will be found.");
	}
}
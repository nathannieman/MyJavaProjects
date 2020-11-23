/*****************************************
* Author : Nathan Nieman
* Date : 10/28/2020
* Assignment: LabArray
******************************************/

public class LabArray
{
   public static void main(String[] args)
   {
      int[] intArray = new int[3];
      
      printArray(intArray, "intArray");
      
      intArray[0] = 2;
 		
		intArray[intArray.length-1] = 4;
      
      printArray(intArray, "intArray");
      
      System.out.printf("length of intArray: %d%n", intArray.length);
      
      int number = 3;
      
      intArray[1] = number + 4;
      
      intArray[2] = intArray[0];
      
      printArray(intArray, "intArray");
		
 	}	
	
	private static void printArray(int[] integerArray, String name)
	{
	   System.out.printf("%s: ", name);
		for (int i = 0; i < integerArray.length; i++)
		{
			System.out.printf("%d ", integerArray[i]);
		}
		System.out.println();
	}
}
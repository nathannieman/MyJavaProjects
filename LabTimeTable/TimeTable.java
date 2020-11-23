/*****************************************
* Author : Nathan Nieman
* Date : 10/16/2020
* Assignment: LabTimeTable
******************************************/
import java.util.Scanner;

public class TimeTable
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Time Table:");
      System.out.print("Number (1 - 10): ");
      
      int userNumber = input.nextInt();
      
      for (int n = 1; n <= 10; n++)
      {
         
         System.out.printf("%2d * %d = ", n, userNumber);
         System.out.printf("%-2d%n", (userNumber * n));
      }
      
   }
   
}
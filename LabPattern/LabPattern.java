/*****************************************
* Author : Nathan Nieman
* Date : 10/23/2020
* Assignment: LabPattern
******************************************/

public class LabPattern
{
   public static void main(String[] args)
   {
      pattern3();
   }
   
   private static void pattern3()
   {
      for (int i = 1; i <= 5; i++)
      {
         for (int j = -1; j < 5 - i; j++)
         {
            System.out.print("o ");
         }
         for (int j = 3; j <= 1 + i; j++)
         {
            System.out.print(". ");
         }
         System.out.println();
      }
   }
}
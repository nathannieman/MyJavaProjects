/*****************************************
* Author : Nathan Nieman
* Date : 09/15/2020
* Assignment: A03
******************************************/
import java.util.Scanner;

public class ThreeNumbers
{
   public static void main(String[] args)
   {
      //Declare instance of scanner and variables
      Scanner input = new Scanner(System.in);
      
      int n1;
      int n2;
      int n3;
      
      //Prompt user to enter 3 integers
      
      System.out.print("Enter 3 numbers separated by a space: ");
      n1 = input.nextInt();
      n2 = input.nextInt();
      n3 = input.nextInt();
      System.out.print("Sorted numbers: ");
      
      //If-Else statements that will organize the numbers from smallest to largest
      
      if (n1 < n2 ) 
      {
        
         if (n1 < n3)
         {
            
            if (n2 < n3)
            {
               System.out.println(n1 + " " + n2 + " " + n3);
            }
            
            else 
            {
               System.out.println(n1 + " " + n3 + " " + n2);
            }
         }
         
         else 
         {
            System.out.println(n3 + " " + n1 + " " + n2);
         } 
       }
       
       else
       {
         
         if (n2 < n3)
         {
            
            if (n1 < n3)
            {
               System.out.println(n2 + " " + n1 + " " + n3);
            }
            
            else
            {
               System.out.println(n2 + " " + n3 + " " + n1);
            }
         }
         
         else 
         {
            System.out.println(n3 + " " + n2 + " " + n1);
         }
       }
       
       
      
      
    }
 }
/*****************************************
* Author : Nathan Nieman
* Date : 10/05/2020
* Assignment: Midterm
******************************************/
import java.util.Scanner;

public class IfApp
{
   public static void main (String[] args) 
   {
      //Fields
      int n1;
      int n2;
      int n3;
      int product;
      
      //Instance of scanner
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter 3 integers and calculate product.
      System.out.println("Enter 3 integers ");
      n1 = input.nextInt();
      n2 = input.nextInt();
      n3 = input.nextInt();
      product = (n1 * n2 * n3);
   
      System.out.println("n1: " + n1);
      System.out.println("n2: " + n2);
      System.out.println("n3: " + n3);
      
      //If-else if product is greater or equal to 75 prints "This is a large product."
      if (product >= 75) 
      {
         System.out.println("This is a large product ");
      }
      else
      {
         System.out.printf("The product of %d, %d, & %d is %d\n", n1, n2, n3, product);
      }
      
      System.out.println(" ");
      System.out.println("==================================================");
   }
}
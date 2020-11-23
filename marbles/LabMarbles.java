/*****************************************
* Author : Nathan Nieman
* Date : 09/07/2020
* Assignment: LabMarbles
******************************************/
 
import java.util.Scanner;

public class LabMarbles
{
   public static void main(String[] args)
   {
      Scanner scnr = new Scanner(System.in);
      System.out.print("color: ");
      String color1 = scnr.next();
      System.out.print("Number of " + color1 + " marbles: ");
      int number1 = scnr.nextInt();
      
      System.out.print("color: ");
      String color2 = scnr.next();
      System.out.print("Number of " + color2 + " marbles: ");
      int number2 = scnr.nextInt();
      
      System.out.print("color: ");
      String color3 = scnr.next();
      System.out.print("Number of " + color3 + " marbles: ");
      int number3 = scnr.nextInt();
      
      System.out.println();
      System.out.format("%-12s", "Color");
      System.out.format("%10s%n", "Number of Marbles");
      System.out.format("%-12s", "-----------");
      System.out.format("%-10s%n", "-----------------");
      System.out.format("%-12s", color1);
      System.out.format("%-10s%n", + number1);
      System.out.format("%-12s", color2);
      System.out.format("%-10s%n", + number2);
      System.out.format("%-12s", color3);
      System.out.format("%-10s%n", + number3);
   }
}
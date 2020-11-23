/*****************************************
* Author : Nathan Nieman
* Date : 09/12/2020
* Assignment: A02
******************************************/

import java.util.Scanner;

public class SkiTickets
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   //Declare all variables and set prices for youth and adult tickets.
   double adults = 93;
   double youths = 47;
   double adultTotal;
   double youthTotal;
   double total;
   int adultTickets;
   int youthTickets;
   String name;
   
   //Recieve input fromm user using prompts and scanner.
   System.out.println("How many adult tickets: ");
   adultTickets = input.nextInt();
   System.out.println("How many youth tickets: ");
   youthTickets = input.nextInt();
   System.out.println("Name: ");
   input.nextLine();
   name = input.nextLine();
   System.out.println("\n");
   
   
   //Output for invoice based on information provided.
   System.out.println("Number of adult tickets: " + adultTickets);
   System.out.println("Number of youth tickets: " + youthTickets);
   System.out.println("Name: " + name);
   System.out.print("\n\n");
   adultTotal = (adults * adultTickets);
   youthTotal = (youths * youthTickets);
   total = (adultTotal + youthTotal);
   
   //Aligned text for the totals.
   System.out.println("Invoice for " + name + ": ");
   System.out.println("\n"); 
   System.out.printf("Adult tickets " + adultTickets + "%1s %.2f%n", " .. $ " , adultTotal);
   System.out.printf("Youth tickets " + youthTickets + "%1s %.2f%n", " .. $ " , youthTotal);
   
   System.out.println("-----------------------------");
   System.out.printf("%21s %.2f%n", "$ ", total);
   System.out.printf("%28s%n", "=========");
   
   
   }
}
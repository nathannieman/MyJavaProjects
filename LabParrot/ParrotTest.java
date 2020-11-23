/*****************************************
* Author : Nathan Nieman
* Date : 09/13/2020
* Assignment: LabParrot
******************************************/

import java.util.Scanner;


public class ParrotTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Parrot myParrot = new Parrot();
      String text;
      
      System.out.print("What would you like to say to the parrot? ");
      text = input.nextLine();
      myParrot.speak(text);
   }
}
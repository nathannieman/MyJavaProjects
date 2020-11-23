/*****************************************
* Author : Nathan Nieman
* Date : 11/15/2020
* Assignment: LabPartyGuests
* Purpose: Retrieves 4 names from user then
* prints list of names, removes a random
* name then prints a new list.
******************************************/

import java.util.Scanner;
import java.util.ArrayList;

public class PartyGuests
{

   public static void main(String[] args) 
   {

      ArrayList<String> guestList = new ArrayList<String>();

      Scanner input = new Scanner(System.in);

      System.out.print("Please enter 4 guests : \n");

      for(int i = 1; i < 5; i++)

      {  

         System.out.print("guest" + i + ": ");

         String guestName = input.next();

         guestList.add(guestName);

      }

      System.out.print("\nGuest list : ");
      System.out.print(guestList + "\n");
      int randomGuest = (int)((Math.random()*4));
      System.out.print((String)guestList.get(randomGuest) + " can't come\n");
      guestList.remove(randomGuest);
      System.out.print("Upadated guest list: ");     
      System.out.print(guestList);
   }  

}
/*****************************************
* Author : Nathan Nieman
* Date : 10/31/2020
* Assignment: A07 Volumes
******************************************/

import java.util.Scanner;

public class VolumesMenu
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Volumes myVolume = new Volumes();
      
      int volumeChoice;
      
      do
      {
         menuPrompt();
         volumeChoice = input.nextInt();
         
         switch (volumeChoice)
         {
            case 1:
            System.out.printf("cuboid(2, 4, 6): volume = %.1f%n%n",myVolume.cuboid(2,4,6));
            break;
            
            case 2:
            System.out.printf("cuboid(4): volume = %.1f%n%n",myVolume.cuboid(4));
            break;
            
            case 3:
            System.out.printf("ellipsoid(2, 4, 6): volume = %.1f%n%n",myVolume.ellipsoid(2, 4, 6));
            break;
            
            case 4:
            System.out.printf("ellipsoid(4): volume = %.1f%n%n",myVolume.ellipsoid(4));
            break;
            
            case 5:
            System.out.printf("cylinder(3, 4): volume = %.1f%n%n",myVolume.cylinder(3, 4));
            break;
            
            case 6:
            System.out.printf("cone(6, 5): volume = %.1f%n%n",myVolume.cone(6, 5));
            break;     
            
            case 0:
            System.out.println("Good bye");
            break;
            
            default: 
            System.out.printf("invalid input%n%n");
            break;
               
         }
      }while (volumeChoice != 0);
   }
   
   public static void menuPrompt()
   {
      System.out.printf("%-25s %-25s\n","1 .. cuboid(2, 4, 6)","2 .. cuboid(4) "); 
      System.out.printf("%-25s %-25s\n","3 .. ellipsoid(2, 4, 6)","4 .. ellipsoid(4)");
      System.out.printf("%-25s %-25s\n","5 .. cylinder(3, 4)","6 .. cone(6, 5)");   
      System.out.printf("%-25s\n","0 .. exit ");
      System.out.printf("Your Choice: ");
   }
}
/*****************************************
* Author : Nathan Nieman
* Date : 10/24/2020
* Assignment: LabRectangle
******************************************/

import java.util.Scanner;

public class RectangleMenu
{
	public static void main(String[] args)
	{
       Scanner input = new Scanner(System.in);
	    Rectangle rectangle = new Rectangle(5, 4);
       int selection;
       
       do
       {
         menuPrompt();
         
         selection = input.nextInt();

         switch (selection)
         {
            case 0:
               System.out.println("Good Bye");
               selection = 0;
               break;
            case 1:
               System.out.println("Area: " + rectangle.area());
               System.out.println();
               break;
            case 2:
               System.out.println("Perimeter: " + rectangle.perimeter());
               System.out.println();
               break;
            case 3:
               System.out.printf("Length: %d%nWidth: %d%n", rectangle.getLength(), rectangle.getWidth());
               System.out.println();
               break;
            default:
               System.out.println("Invalid input ");
               System.out.println();
               break;
         }
       } while (selection != 0);
  	}
	
	private static void menuPrompt()
	{
	   System.out.println("1 .. area");
		System.out.println("2 .. perimeter");
		System.out.println("3 .. length and width");
		System.out.println("0 .. exit");
		System.out.print("Your choice: ");
	}
}
/*****************************************
* Author : Nathan Nieman
* Date : 10/05/2020
* Assignment: Midterm
******************************************/

public class EagleApp{

   public static void main (String[] args) 
   {
      Eagle eagle = new Eagle(8);
      
      eagle.catchMouse();

		System.out.println("mouseCount: " + eagle.getMouseCount());

		eagle.fly();

		eagle.catchMouse();
      eagle.catchMouse();

		System.out.println("mouseCount: "+eagle.getMouseCount());
      
      System.out.println(" ");
      System.out.println("==================================================");
   }
}
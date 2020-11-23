/*********************
* Midterm Ship.App
* Created by Karen Klassen
* DO NOT MODIFY!!!!
* This is used to test the Ship.java class
**********************/
public class ShipApp{

   public static void main(String[] args){
   
      Ship cruiseFerry = new Ship("Peter Pan",21.0);
      Ship dinghy = new Ship("Laser Dinghy",25.0);

      System.out.println("Cruise Ferry:");
      System.out.printf("Name: %s%n",cruiseFerry.getName());
      System.out.printf("Speed: %.1f knots%n",cruiseFerry.getSpeed());
      System.out.printf("Time to cross bass strait: %.1f hours%n%n",cruiseFerry.travelTime(374));
      
      System.out.println("Dinghy:");
      System.out.printf("Name: %s%n",dinghy.getName());
      System.out.printf("Speed: %.1f knots%n",dinghy.getSpeed());
      System.out.printf("Time to cross bass strait: %.1f hours%n",dinghy.travelTime(374));
      

   }
}
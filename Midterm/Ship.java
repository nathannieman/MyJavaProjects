/*****************************************
* Author : Nathan Nieman
* Date : 10/05/2020
* Assignment: Midterm
******************************************/

public class Ship
{

   //Fields
   private String name;
   private double speed;
  
   //Constructors
   public Ship(String n, Double s)
   {
      name = n;
      speed = s;
   }
     
   //Methods
   public String getName()
   {
      return name;
   }   
   
   public double getSpeed()
   {
      return speed;
   }
   
   public double travelTime(double distance)
   {
      double mph = speed * 1.151;
      double time = distance / mph;
      return time;      
   }

}
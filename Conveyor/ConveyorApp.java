/*****************************************
* Author : Nathan Nieman
* Date : 10/02/2020
* Assignment: Conveyor
******************************************/

public class ConveyorApp
{
   public static void main(String[] args)
   {
      
      Conveyor flatBelt = new Conveyor("flat belt",0.9);
      Conveyor roller = new Conveyor("roller",-0.5);
      

      
      System.out.println("Conveyor1: "+ flatBelt.getType() + " conveyor with a speed of " + flatBelt.getSpeed() + " m/s");
      System.out.printf("Time to transport an item 50 m: %.1f s \r\n" , (flatBelt.timeToTransport(50)));
      System.out.println(" ");
      
      System.out.println("Converyor2: "+ roller.getType() + " conveyor with a speed of " + roller.getSpeed() + " m/s");
      System.out.println("Time to transport an item 50 m: " + roller.timeToTransport(50) + " s");
      System.out.println("\n... updating speed\n");
      
      flatBelt.setSpeed(-3);
      roller.setSpeed(0.4);
      
      System.out.println("Conveyor1: "+ flatBelt.getType() + " conveyor with a speed of " + flatBelt.getSpeed() + " m/s");
      System.out.printf("Time to transport an item 50 m: %.1f s \r\n" , (flatBelt.timeToTransport(50)));
      System.out.println(" ");
      
      
      System.out.println("Conveyor2: "+ roller.getType() + " conveyor with a speed of " + roller.getSpeed() + " m/s");
      System.out.println("Time to transport an item 50 m: " + roller.timeToTransport(50) + " s");
   }
}
/*****************************************
* Author : Nathan Nieman
* Date : 10/2/2020
* Assignment: LabHoppityHop
******************************************/

public class HoppityHop
{
   public static void main(String[] args) 
   {
      hoppityHop(30);
   }
   
   private static void hoppityHop(int max) 
   {
      for (int n = 1; n <= max; n++) 
      {    
         if (n%3 == 0 && n%5 == 0)
            System.out.println("Hoppity Hop");
         
         else if (n%5 == 0)
            System.out.println("Hop");
         
         else if (n%3 == 0)
            System.out.println("Hoppity");
         
         else if (n%3 != 0 && n%5 != 0)
            System.out.println(n);
      }
   }
}
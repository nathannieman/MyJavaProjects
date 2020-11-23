/*****************************************
* Author : Nathan Nieman
* Date : 11/6/2020
* Assignment: LabEratosthenes
******************************************/

public class LabEratosthenes
{
   public static void main(String[] args)
   {
      int n = 120;
      boolean[] primes = new boolean[n];
      
      initArray(primes);
      crossOutNonPrimes(primes);
      printPrimes(primes);
      
   }
   
   private static void initArray(boolean[] array)
   {
      for(int i = 2; i < array.length; i++)
         array[i] = true;
   }
   
   private static void crossOutNonPrimes(boolean[] array)
   {
      for(int i = 2; i < array.length; i++) 
      {
         if(array[i])
         {
            for(int j = i; j*i < array.length; j++)
            {
               array[i*j] = false;
            }
         }
      }
   }
   
   private static void printPrimes(boolean[] array)
   {
      System.out.println("Prime Numbers");
      for (int i = 2; i < array.length; i++)
      {
         if (array[i])
         {
            System.out.print(i + " ");
            
            if (i % 10 == 0)
            {
            System.out.println();
            }
         }
      }
   }
}
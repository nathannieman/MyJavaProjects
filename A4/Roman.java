/*****************************************
* Author : Nathan Nieman
* Date : 10/24/2020
* Assignment: A4
******************************************/

public class Roman
{
   public void summary()
   {  
      String I = "I = 1";
      String V = "V = 5";
      String IV = "IV = 4";
      String X = "X = 10";
      String IX = "IX = 9";
      String L = "L = 50";
      String XL = "XL = 40";
      String C = "C = 100";
      String XC = "XC = 90";
      String D = "D = 500";
      String CD = "CD = 400";
      String M = "M = 1000";
      String CM = "CM = 900";
      
      System.out.printf("%-1s%n", I);
	   System.out.printf("%-1s\t\t\t%-1s%n", V, IV);
	   System.out.printf("%-6s\t\t%-6s%n", X, IX);
	   System.out.printf("%-6s\t\t%-7s%n", L, XL);
	   System.out.printf("%-7s\t\t%-8s%n", C, XC);
	   System.out.printf("%-7s\t\t%-8s%n", D, CD);
	   System.out.printf("%-8s\t\t%-1s%n%n", M, CM);
   }
   
   public void printNumeral(int number)
   {
       if (number > 0 && number <= 40)
       {
         
         int numeral = number;
         String romanNumeral = "";
        
         while(numeral >= 10)
        {
            romanNumeral += "X";
            numeral -= 10;
        }

         while(numeral >= 9)
        {
            romanNumeral += "IX";
            numeral -= 9;
        }

         while(numeral >= 5)
        {
            romanNumeral += "V";
            numeral -=5;
        }

         while(numeral >= 4)
        {
            romanNumeral += "IV";
            numeral -= 4;
        }

         while(numeral >= 1)
        {
            romanNumeral += "I";
            numeral -= 1;
        }
      

         System.out.printf("%s \n", romanNumeral); 
       }
       
       
       else
       {
         System.out.println("Valid number range: 1 - 39");
       }
   }
}
/*****************************************
* Author : Nathan Nieman
* Date : 10/24/2020
* Assignment: A4
******************************************/

public class RomanApp
{
   public static void main(String[] args) {

		Roman roman = new Roman();
		
		roman.summary();
		
		for(int i = 0; i <= 39; i++) 
      {
			roman.printNumeral(i);
		}
		
	}
}
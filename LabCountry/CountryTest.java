/*****************************************
* Author : Nathan Nieman
* Date : 11/16/2020
* Assignment: LabCountry
******************************************/

public class CountryTest
{
	public static void main(String[] args)
	{
      Continent continent = Continent.NORTH_AMERICA;
      Country country1 = new Country("USA", continent);
      Country country2 = new Country("Austria", Continent.EUROPE);
 		System.out.printf("MyContinent: %s%n", continent);
 		System.out.printf("Country1: %s (%s)%n", country1.getName(), country1.getContinent());
 		System.out.printf("Country2: %s (%s)%n", country2.getName(), country2.getContinent());
	}
}
/********************************************************
 *
 *  Project :  DOW with Arrays 
 *  File    :  DOWwithArrays.java
 *  Name    :  Nathan Nieman
 *  Date    :  03/31/2018
 *
 *  Description : 
 *
 *    1) Find the High, Low and Average Temperature for each day of the week.
 *
 *    2) While, if, and if-else structures implemented.
 *
 *    3) While checked if days are less than 8 so it would loop until it reached 8. Used to check for EOF. If used to calculate the high and low temperatures.
 * 
 *
 *  Assumptions :
 * -All input records will contain valid information.
 * -Temperatures can be negative.
 * -User understands they are only writing to a file not getting an output.
 * -User understands temperature, days of week, and averages.
 * 
 ********************************************************/
package dowwitharrays;

import java.util.Arrays;

public class DOWwithArrays
{
    public static void main(String[] args)
    {//start
        
        //initialization
        InputFile inFile = new InputFile("input.txt");
        OutputFile outFile = new OutputFile("output.txt");
        
        int day = 0;
        int temperature = 0;
        
        //declares an array of integers
        int[] totalArray = new int [8];
        int[] countArray = new int [8];
        int[] highArray = new int [8];
        int[] lowArray = new int [8];

        
        System.out.println("DOW Temperature Started. Please wait..."); // output to user
        
        while (day<8) // condition that will ensure everthing is initialized properly for each day
        {
            totalArray[day]=0;
            countArray[day]=0;
            highArray[day]=-9999;
            lowArray[day]=9999;
            day=day+1;

        }
        
        while(!inFile.eof()) // checking for not end of file so it will keep looping until the last number
        {
            day = inFile.readInt(); //read first int
            temperature = inFile.readInt(); //read second int
            
            if (temperature>highArray[day])
            {
               highArray[day] = temperature; 
            }
            
            if (temperature<lowArray[day])
            {
                lowArray[day] = temperature;
            }
            
            countArray[day] = countArray[day] + 1; // Counters for displaying average
            totalArray[day] = totalArray[day] + temperature;

        }
        
        day = 1; //setting day equal to one to reset it

        while (day<8)
        {
            //if-else to see if it has actually counted for that day or not
            if (countArray[day] > 0)
            {
                //writing to the output file
                outFile.writeInt(day);
                outFile.writeInt(highArray[day]);
                outFile.writeInt(lowArray[day]);
                outFile.writeInt(totalArray[day] / countArray[day]);
                outFile.writeEOL(); //writes for the end of the line, must have
            }
            else
            {
                outFile.writeInt(day);
                outFile.writeWord(0 + " " + 0 + " " + 0); //Writing out the zeros if it doesn't have any information
                outFile.writeEOL();
            }
            day = day + 1; //counter so that it will do it for all 7 days
        }
        System.out.println("Dow Temperature completed successfully"); //Output to user
        
        System.out.println(Arrays.toString(totalArray));
        
        outFile.close(); //closes the file, must have
        
    } //stop
}

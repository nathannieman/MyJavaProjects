/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemath;

import java.util.Scanner;

/**
 *
 * @author Nathan Nieman
 */
public class SimpleMath 
{


    public static void main(String[] args) 
    {
        Scanner value = new Scanner (System.in);
        
        int num1; 
        int num2; 
        int num3;
        int num4;
        int num5;
        int sum; 
        int average;
        int product;
        int smallest;
        int largest;
        int quotient;
        int remainder;
        
        System.out.print ("Enter Your First Number: ");
        num1 = value.nextInt ();
        System.out.print ("Enter Your Second Number: ");
        num2 = value.nextInt ();
        System.out.print ("Enter Your Third Number: ");
        num3 = value.nextInt ();
        System.out.println("Enter Your Fourth Number");
        num4 = value.nextInt ();
        System.out.println("Enter Your Fifth Number");
        num5 = value.nextInt ();
        
        sum = num1 + num2 + num3 + num4 + num5;
        average = (num1 + num2 + num3 + num4 + num5)/5;
        product = num1 * num2 * num3 * num4 * num5;
        
        smallest = num1; // assume smallest is the first number
        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;
        
        largest = num1; // assume largest is the first number
        if (num2 > largest)
            largest = num2;
        if (num3 > largest)
            largest = num3;
        if (num4 > largest)
            largest = num4;
        if (num5 > largest)
            largest = num5;
        
        quotient = num1 / num2;
        remainder = num4 % num5;
        
        
        
        System.out.printf ("\nSum = %d\nAverage = %d\nProduct = %d\nSmallest = %d\n"
                + "Largest = %d\n" + "Quotient = %d\nRemainder = %d\n"
                , sum, average, product, smallest, largest, quotient, remainder);
    }
}

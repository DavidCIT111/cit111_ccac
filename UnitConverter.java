/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author David
 */
public class UnitConverter {
    public static void main(String[] args) {
        // create a scanner object to gather user input
        Scanner scan = new Scanner(System.in);
        
        System.out.println("***ALMOST LIKE MAGIC UNIT CONVERTER***");
        System.out.println("Enter the number of grams: ");
        double inputGrams = scan.nextDouble();
        System.out.println("Convert to which unit kilograms(k),ounces(o),pounds(l): ");
        
        double convertedVal = inputGrams;
        //Pattern p = new Pattern("*")
        
        int check = 0;
        while(check ==0)
        {
            if (scan.hasNextLine())
            {
                
                String input = scan.nextLine();  
                if (input.contains("k"))
                {
                    convertedVal = convertedVal * .001;

                    String valString = String.valueOf(convertedVal);
                    System.out.println("The number of kilograms in grams is: " + valString);
                    check = 1;
                }

                 if(input.contains("o"))
                {
                    convertedVal = convertedVal * 0.035274;

                    String valString = String.valueOf(convertedVal);
                    System.out.println("The number of ounces in grams is: " + valString);
                    check = 1;
                }

                 if(input.contains("l"))
                {
                    convertedVal = convertedVal * 0.00220462;
                    String valString = String.valueOf(convertedVal);
                    System.out.println("The number of pounds in grams is: " + valString);
                    check = 1;
                }

            }
        }
    } // close main
    
} // close class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author David
 */
public class MysteryDoor {
    
    public static void main(String[] args) {
      
        // create a scanner object to read in user input
        Scanner keyboardScanner = new Scanner(System.in);
        // create a variable for holding a user selection and running switch
        int userSelection;
        
        System.out.println("Welcome to Mystery Door???");
        System.out.println("??????? What Will You Find ???????");
        System.out.println("");
        System.out.println("??????????    ???????????     ??????????");
        System.out.println("?  ??    ?    ?  ?  ?   ?     ? ???    ?");
        System.out.println("?   ?    ?    ? ?    ?  ?     ?    ?   ?");
        System.out.println("?   ?    ?    ?      ?  ?     ? ?????  ?");
        System.out.println("?   ?    ?    ?    ?    ?     ?    ?   ?");
        System.out.println("?  ???   ?    ? ??????  ?     ? ???    ?");
        System.out.println("??????????    ???????????     ??????????");
        
        System.out.println("Choose 1, 2, or 3 and then press enter!");
        
        // read in an integer from the user through the keyboard
        userSelection = keyboardScanner.nextInt();
        
        // match the value of userSelection to a case's value and execute the code
        // in that case until a break; is encountered
        switch(userSelection){
            case 1:
                printStatement(); // the case just transfers to a method
                break; // exit switch mechanism
            case 2:
                System.out.println("Mystery Door 2 selected");
                System.out.println("Congratulation's you've chosen the correct door");
                System.out.println("You win free WiFi for life!!!!!");
                break;
            case 3:
               generateBigNumber();
                break;
            // any passs through this switch doesn't match a door hits here
                default:
                    System.out.println("INVALID");
        } // close switching block
        
        } // close main
    
        public static void printStatement(){
            System.out.println("??????????????????");
            System.out.println("Ahhh!!! A Ghost, how spooky!!");
            System.out.println("??????????????????");
        } // close method printStatement
        
        public static void generateBigNumber(){
            System.out.println("????????");
            // create a friendly random number generator
            Random r = new Random();
            // create an object to do math with huge numbers
            BigInteger bigInt = new BigInteger(150, r);
            // display the randomly generated huge number
            System.out.println(bigInt);
            System.out.println("????????");
            
        } // close method generateBigNumber
} // close class

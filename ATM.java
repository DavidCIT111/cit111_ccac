/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dec14;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ATM {
    

    
        public static void main(String[] args) {
        // set bank balance of 10,000
        int balance = 10000, withdraw, deposit;
        
        Scanner scan = new Scanner(System.in);
        String pin;
        
        System.out.println("Welcome to the ATM");
        System.out.println("Enter your PIN");

        pin = scan.nextLine();
        if(pin.equals("9876")){
            System.out.println("Sign in successful");
        } else {
            System.out.println("Error! Incorrect PIN");
            System.exit(0);
        }

        while(true){
            System.out.println("Welcome to the main menu");
            System.out.println("Press 1 to Withdraw");
            System.out.println("Press 2 to Make a Deposit");
            System.out.println("Press 3 to Check Current Balance");
            System.out.println("Press 4 to Exit");
            System.out.println("In order to proceed press a button");

        int menu = scan.nextInt();
        switch(menu){
            case 1:
                System.out.println("Enter Amount to Withdraw");
                withdraw = scan.nextInt();
                if(balance >= withdraw){
                    balance = balance - withdraw;
                    System.out.println("Take Money out of ATM!");
                } else {
                    System.out.println("Insufficient Funds");
                } 
                break;
            
            case 2:
                System.out.println("Enter Amount to be Deposited");
                deposit = scan.nextInt();
                balance = balance + deposit;
                System.out.println("Successful Deposit!");
                break;
                
            case 3:
                System.out.println("Balance :" + balance);
                break;
            
            case 4:
                System.exit(0);
            } // close switch
        } // close while 
    } // close main method 
} // close class

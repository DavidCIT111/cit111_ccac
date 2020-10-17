/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit11online;

import java.util.Scanner;

/**
 *Program to ask user a series of questions to compute an overall friend
 * compatability score
 * @author David
 */
public class FriendMachine {
    
    final static int COMPAT_THRESHOLD = 100;
    
    public static void main(String[] args){
        // create variables with sensible initial values
        int compatScore = 0;
        int responseNum = 0;
        Scanner scan = new Scanner(System.in);
        
        // Welcome user and ask Q1
        System.out.println("Welcome to David's Friend Machine");
        System.out.println("Question 1: Are you an avid fan of music?");
        System.out.println("Yes = 1; No = 0");
        // Use scanner to grab user input
        responseNum = scan.nextInt();
        
        // evaluate response to Question 1; yes = 1, no = 0
        // only run if user likes music
        if(responseNum == 1){
            System.out.println("Righteous, music is good for the soul");
            
            // give user 50 points for liking music
            compatScore = compatScore + 50;
            System.out.println("What's your favorite genre?");
            System.out.println("Hip-hop = 1");
            System.out.println("Country = 2");
            System.out.println("Jam = 3");
            System.out.println("Electronic = 4");
            System.out.println("Other = 5");
            
            responseNum = scan.nextInt();
            if(responseNum == 1){
                System.out.println("Hip-Hop is fire");
                compatScore = compatScore + 20;
            } else if(responseNum ==2){
                System.out.println("Country is the worst");
                compatScore = compatScore - 50;
            } else if(responseNum ==3){
                System.out.println("Jam is tight");
                compatScore = compatScore + 30;
            } else if(responseNum == 4){
                System.out.println("Electronic is proper");
                compatScore = compatScore + 30;
            } else if(responseNum == 5){
                System.out.println("At least you didn't pick country");
                compatScore = compatScore + 10;
            } else {
                System.out.println("Not a valid answer!");
            } 
        }else {
            // for non music people
            System.out.println("No tunes, all good");
            System.out.println("Skipping question 2");
            // move
        } // close if/else question 1 Q1
        
        // reunite to question 3 Q3
        System.out.println("Question 3");
        System.out.println("Are you a fan of anime?");
        // read in answer from user
        responseNum = scan.nextInt();
        if(responseNum == 1){
            System.out.println("Good decision honestly");
            compatScore = compatScore + 20;
        } else {
            System.out.println("You're missing out");
            compatScore = compatScore - 10;
        } // close question 3 if/else
        // display scores:
        System.out.println("Your compatability sore is:  ");
        System.out.println("compatScore");
        System.out.println("Based on a thresdhold score of:  ");
        System.out.println(COMPAT_THRESHOLD);
                
        //final friend compat determination
        if(compatScore >= COMPAT_THRESHOLD){
            System.out.println("Determination: We can be homies");
        } else {
            System.out.println("Determination: It might not be worth it");
        }
        System.out.println("Thanks for using the friend machine!");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author David
 */
public class RoadTrip {
    public static void main(String[] args) {
        
        // declaring and initializing variables
        String = carMake = "1996 Mazda Protege";
        String = carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double tripBudget = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; // declaring this variable but not initializing 
        
        //simulation of the roadtrip
        System.out.println("***Road trip simulator***");
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + "to spend this trip");
        System.out.println("String trip with " + currentNumberOfPassengers + "{Passenger");
        System.out.println("Destination Reached? )" + destinationReached);
        
        // Calculate leg distance: 25% of total trip, store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToTheMoab * decimalOfOneQuater;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        // increment trip odometer by leg dsitance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subtract leg distance from distanceTo desination, over-write distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // "see" hitch hiker heading West
        System.out.println("Oh, look!  A person who wats to go west, too!");
        
        // Check if there is room in the car, if so, pick up hitch hiker
        if(carFull == false){
            System.out.println("Car is not full, picking up hitcher");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
            // alternative shorter version: currentNumberOfPassengers++
        } // close if()
        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        // deduct $ spent on gas from money remaining and over-write tripBudget
        cashOnHand = cashOnHand - gasPriceForLeg;
        // reprint status of variables to the console
        
    } // close class main
} // close class RoadTrip

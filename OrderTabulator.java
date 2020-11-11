/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random;

/**
 *
 * @author David
 */
public class OrderTabulator {
    
    // public intitalized to zero
    private static int totalRamenOrdered = 0;
    private static int totalPhoOrdered = 0;
    private static int totalOrdered = 0;
    
    // name constant values
    final static int MINIMIUM_ORDER = 1;
    final static int MINIMIUM_TOTAL = 1;
    
    public static void main(String[] args){
        System.out.println("In Main");
        orderPho(1, 10);
        printOrderTotals();
        orderRamen(2, 20);
        printOrderTotals();
    } // close main
    
    public static void orderPho(int pho, int total){
        if(total >= MINIMIUM_TOTAL){
    
        System.out.println("Preparing some Pho..");
        System.out.println("It'll be very hot, approach with caution");
        totalPhoOrdered = totalPhoOrdered + pho;
        totalOrdered = totalOrdered + pho;
        Random rand = new Random();
        int totalOrdered = rand.nextInt(pho);
    } // close method orderPho
    } // close if
        
    public static void orderRamen(int ramen, int total){
        if(total >= MINIMIUM_ORDER){
    
        System.out.println("Preparing some Ramen..");
        System.out.println("It'll be very hot, approach with caution");
        totalRamenOrdered = totalRamenOrdered + ramen;
        totalOrdered = totalOrdered + ramen;
        Random rand = new Random();
        int totalOrdered = rand.nextInt(ramen);
    } // close method orderRamen
    } // close if
    
    public static void printOrderTotals(){
        
        System.out.println("********** ORDER TOTALS **********");
        System.out.println("Total Ramen Ordered :" + totalRamenOrdered);
        System.out.println("Total Pho Ordered :" + totalPhoOrdered);
        System.out.println("Total Ordered :" + totalOrdered);
        System.out.println("**********************************");
        
    } // close method TotalOrders 
}  
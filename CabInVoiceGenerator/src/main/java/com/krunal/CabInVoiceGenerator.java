/****************************************************************************************************
 *
 * Purpose :
 *  UC 5 : Premium Rides (Bonus)
 *         - The Cab Agency now supports two types of rides normal rides and premium rides
 *         1. Normal Rides - Rs. 10 per km, Rs. 1 per min, Minimum Fare - Rs. 5
 *         2. Premium Rides - Rs. 15 per km, Rs. 2 per min, Minimum Fare - Rs. 20
 *
 * @author Krunal Lad
 * @Since 13-07-2021
 *
 ****************************************************************************************************/

package com.krunal;

import java.util.Hashtable;
import java.util.Scanner;

public class CabInVoiceGenerator {

    Scanner scanner = new Scanner(System.in);

    /**
     * Purpose : To calculate total fare for normal and premium rides
     *
     * @param distance
     * @param time
     * @return total fare
     */
    public double calculateFare(double distance, int time) {
        int costPerMinute = 0;
        double minimumCostPerKM = 0;
        double minimumFare = 0;

        System.out.println("\nPress 1 - Normal Rides\nPress 2 - Premium Rides");
        //int choice = 2; -- > To test JUNit for premium rides
        int choice = scanner.nextInt();

        if (choice == 1) {

            costPerMinute = 1;
            minimumCostPerKM = 10;
            minimumFare = 5;

        } else if (choice == 2) {

            costPerMinute = 2;
            minimumCostPerKM = 15;
            minimumFare = 20;

        } else {

            System.out.println("Invalid Input !!! ");

        }

        double totalFare = distance * minimumCostPerKM + time * costPerMinute;

        if (totalFare < minimumFare)
            return minimumFare;

        return totalFare;

    }

    /**
     * Purpose : To calculate fare for multiple rides
     *
     * @param rides array of multiple rides
     * @return total aggregate fare of multiple rides
     */
    public InVoiceSummary calculateFare(Ride[] rides) {

        double totalAggregateFare = 0;
        for (Ride ride : rides) {

            totalAggregateFare += this.calculateFare(ride.distance, ride.time);

        }

        System.out.println(totalAggregateFare);
        return new InVoiceSummary(rides.length, totalAggregateFare);

    }

    /**
     * Purpose : To take user ID and get list of ride and return invoice
     *
     * @param listOfRides
     * @return
     */
    public InVoiceSummary inVoiceService(Hashtable<Integer, Ride[]> listOfRides) {

        Ride[] rides = listOfRides.get(1);
        InVoiceSummary inVoiceSummary = calculateFare(rides);
        return inVoiceSummary;

    }
    
}

/****************************************************************************************************
 *
 * Purpose :
 *  UC 3 : Enhanced Invoice :
 *         The invoice generator should now return the following as a part of invoice :
 *         - Total Number of Rides
 *         - Total Fare
 *         - Average Fare per Ride
 *
 * @author Krunal Lad
 * @Since 13-07-2021
 *
 ****************************************************************************************************/

package com.krunal;

public class CabInVoiceGenerator {

    private static final int COST_PER_MINUTE = 1;
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final double MINIMUM_FARE = 5.0;

    /**
     * Purpose : To calculate total fare
     *
     * @param distance
     * @param time
     * @return total fare
     */
    public double calculateFare(double distance, int time) {

        double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_MINUTE;

        if(totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
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
        for (Ride ride :rides) {
            totalAggregateFare += this.calculateFare(ride.distance,ride.time);
        }
        System.out.println(totalAggregateFare);
        return new InVoiceSummary(rides.length,totalAggregateFare);
    }
}

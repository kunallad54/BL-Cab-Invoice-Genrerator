/****************************************************************************************************
 *
 * Purpose :
 *  UC1 : Given Distance and Time ,the invoice generator should return total fare of the journey
 *       COST --> Rs. 10 per kilometer , Rs. 1 per minute
 *                Minimum Fare = 5 Rs.
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

}

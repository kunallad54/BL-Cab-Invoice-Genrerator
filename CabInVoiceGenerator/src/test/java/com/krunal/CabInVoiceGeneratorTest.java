/**
 * Purpose : To perform JUnit testing on methods of Cab Invoice Generator
 *
 */

package com.krunal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInVoiceGeneratorTest {
    CabInVoiceGenerator inVoiceGenerator = null;

    @Before
    public void setUp() throws Exception {
        inVoiceGenerator = new CabInVoiceGenerator();
    }

    /**
     * Test Case 1 : given distance and time should return total fare
     */
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance = 4.0;
        int time = 10;
        double totalFare = inVoiceGenerator.calculateFare(distance, time);

        Assert.assertEquals(50.0,totalFare,0.0);
    }
}
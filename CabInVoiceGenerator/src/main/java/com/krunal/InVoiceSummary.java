package com.krunal;

public class InVoiceSummary {
    private final int numberOfRides;
    private final double totalFare;
    private final double averageFare;

    public InVoiceSummary(int numberOfRides, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InVoiceSummary that = (InVoiceSummary) o;
        return numberOfRides == that.numberOfRides &&
                Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.averageFare, averageFare) == 0;
    }


}

package com.bridgelabz;

public class InvoiceGenerator {

    private static final double MINIMUM_COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;

    public double calculateFare(double distance, int time) {
        double totalFare= distance*MINIMUM_COST_PER_KM+time*COST_PER_TIME;
        double MinFare=5;
        if(totalFare<MinFare)
            return MinFare;
        else return totalFare;
    }
}

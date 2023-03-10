package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvoiceServiceTest {
    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    @Test
    public void givenlessDistanceAndTime_shouldReturnMinFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }
    public  void givenMultipleRidesShouldReturnTotalFare(){
     InvoiceGenerator invoiceGenerator  = new InvoiceGenerator();
     Ride ride1=new Ride(2.0,5);
    }
}

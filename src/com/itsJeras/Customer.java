package com.itsJeras;

import java.util.ArrayList;

public class Customer {
    public static ArrayList<Customer> List = new ArrayList<>();
    int ID; // ID of a customer in database.
    int ElectricBill; // How much do they have to pay this month. (Not visible in payment history)
    int CustomerFor; // No. of months they have been our customer for.
    int[] PaymentHistory;

    public Customer(int ID, int electricBill, int customerFor, int[] paymentHistory) {
        this.ID = ID;
        ElectricBill = electricBill;
        CustomerFor = customerFor;
        PaymentHistory = paymentHistory;
    }
}

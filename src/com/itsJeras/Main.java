package com.itsJeras;
/*
THEME:
Data visualization software
Electricity billing system
*/
// TODO: Replace "" with path to words.txt for this program to work (Generate.java line: 37)

public class Main {
    private static int NumOfCustomers;
    public static void main(String[] args) {
        NumOfCustomers = 100;
        Generate.Customers(NumOfCustomers);
        DisplayData();
    }

    private static void DisplayData () {
        int CurrentCustomer = 0;
        for (Customer Customer : Customer.List) {
            CurrentCustomer++;
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
            System.out.println("Customer: " + CurrentCustomer + "/" + NumOfCustomers);
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
            System.out.println();
            System.out.println("ID: " + Customer.ID);
            System.out.println("El. Bill: " + Customer.ElectricBill);
            System.out.println("Customer for: " + Customer.CustomerFor + " months");
            //System.out.println("Payment history: " + Arrays.toString(Customer.PaymentHistory));
            int[][] VisualPaymentHistory = new int[10][120];
            for (int y = 0; y < 10; y++) {
                switch (y) {
                    case (0) -> {
                        System.out.print(">900 ");
                        for (int x = 0; x < 120; x++) {
                            if (Customer.PaymentHistory[x] > 900) {
                                System.out.print("█");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    case (1) -> {
                        System.out.print(">800 ");
                        for (int x = 0; x < 120; x++) {
                            if (Customer.PaymentHistory[x] > 800) {
                                System.out.print("█");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    case (2) -> {
                        System.out.print(">700 ");
                        for (int x = 0; x < 120; x++) {
                            if (Customer.PaymentHistory[x] > 700) {
                                System.out.print("█");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    case (3) -> {
                        System.out.print(">600 ");
                        for (int x = 0; x < 120; x++) {
                            if (Customer.PaymentHistory[x] > 600) {
                                System.out.print("█");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    case (4) -> {
                        System.out.print(">500 ");
                        for (int x = 0; x < 120; x++) {
                            if (Customer.PaymentHistory[x] > 500) {
                                System.out.print("█");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    case (5) -> {
                        System.out.print(">400 ");
                        for (int x = 0; x < 120; x++) {
                            if (Customer.PaymentHistory[x] > 400) {
                                System.out.print("█");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    case (6) -> {
                        System.out.print(">300 ");
                        for (int x = 0; x < 120; x++) {
                            if (Customer.PaymentHistory[x] > 300) {
                                System.out.print("█");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    case (7) -> {
                        System.out.print(">200 ");
                        for (int x = 0; x < 120; x++) {
                            if (Customer.PaymentHistory[x] > 200) {
                                System.out.print("█");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    case (8) -> {
                        System.out.print(">100 ");
                        for (int x = 0; x < 120; x++) {
                            if (Customer.PaymentHistory[x] > 100) {
                                System.out.print("█");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    case (9) -> {
                        System.out.print(">0   ");
                        for (int x = 0; x < 120; x++) {
                            if (Customer.PaymentHistory[x] > 0) {
                                System.out.print("█");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}

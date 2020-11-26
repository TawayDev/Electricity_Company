package com.itsJeras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Generate {
    public static void Customers (int NumOfCustomers) {
        for (int i = 0; i < NumOfCustomers; i++) {
            int current = i+1;
            System.out.println("Generated: " + current + "/" + NumOfCustomers);
            // Generate customer ID:
            int ID = Math.abs(GenerateID(genNum(1,562770)));
            // Generate this months electricity bill:
            int ElectricBill = genNum(1,1000);
            // How long have they been our customer for:
            int  CustomerFor = genNum(1,120);
            // Generate payment history:
            int[] PaymentHistory = new int[120];
            for (int j = 0; j < CustomerFor; j++) {
                PaymentHistory[j] = genNum(10,1000);
            }
            Customer.List.add(new Customer(ID,ElectricBill,CustomerFor,PaymentHistory));
        }
    }

    private static int genNum (int min, int max){
        int result = ThreadLocalRandom.current().nextInt(min, max + 1);
        return result;
    }

    private static int GenerateID (int getLine) {
        BufferedReader reader;
        try {
            int currentLine = 0;
            reader = new BufferedReader(new FileReader(/*Replace "" with path to words.txt*/""));
            String line = reader.readLine();
            while (line != null) {
                currentLine++;
                if (currentLine == getLine) {
                    return line.hashCode();
                }
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

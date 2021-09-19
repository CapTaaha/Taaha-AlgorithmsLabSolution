package denominations;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        // 1. Taking size of denominations
        System.out.println("Enter the size:");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        // 2. Taking currency denomination values
        System.out.println("Enter your denomination values");
        int[] array = new int[size];

        // 3.Taking values in array
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }

        // 4. Sorting the denominations
        MergeSort ob = new MergeSort();
        ob.sort(array, 0, array.length - 1);
        System.out.println("Sorted denominations:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }

        // 5.Taking amount paid
        System.out.println("Enter the amount you want to pay;");
        int amt = scn.nextInt();

        // 6.Distribution
        int q = 0;
        int[] noOfNotes = new int[array.length - 1];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] <= amt) {
                q = amt / array[i];
                amt = amt % array[i];
                noOfNotes[i] = q;
            }
        }
        if (amt == 0) {
            for (int i = 0; i < array.length; i++) {
                if (noOfNotes[i] != 0) {
                    System.out.println(array[i] + ":" + noOfNotes[i]);
                }
            }
        } else {
            System.out.println("Amount is not payable.");
            scn.close();
        }

    }
}

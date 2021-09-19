package transaction;

import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        // 1. Enter no. of transactions
        System.out.println("Enter number of transactions:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // 2. Creating arrays
        System.out.println("Enter your values");
        int[] array = new int[n];

        // 3.Taking values in array
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }

        // 4.Taking no.of targets
        System.out.println("Enter the number of targets:");
        int noTarget = scn.nextInt();

        // 5. Taking target values

        for (int i = 0; i < noTarget; i++) {
            System.out.println("Enter the target value:");
            int target = scn.nextInt();
            int array_sum = 0;
            int flag = 0;

            for (int j = 0; j < n; j++) {
                if (target > array_sum) {
                    array_sum = array_sum + array[j];

                } else {
                    System.out.println("Target achieved after" + j);
                    flag = 1;
                    break;
                }

            }

            if (flag == 0) {
                System.out.println("Target not achieved.");
            }

        }

    }
}

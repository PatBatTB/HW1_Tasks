package java2022_1;

import java.util.Scanner;

public class CNeedSum2018 {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        int n = scin.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scin.nextInt();
        }

        n = scin.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scin.nextInt();
        }

        n = scin.nextInt();

        int indexA = 0;
        int indexB = b.length -1;
        int counter = 0;

        while (indexA < a.length && indexB >= 0) {
            int sum = a[indexA] + b[indexB];
            if (sum == n) {
                counter++;
                indexB--;
            } else if (sum > n) {
                indexB--;
            } else {
                indexA++;
            }
        }
        System.out.println(counter);
    }

}

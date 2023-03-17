package java2022_1;

import java.util.Scanner;

public class AMaxSum2018 {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        int n = scin.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scin.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scin.nextInt();
        }

//        int[] a = {4,-8,6,0};
//        int[] b = {-10,3,1,1};

        int ai = 0;
        int bj = 0;
        int max = a[ai] + b[bj];
        int sum;

        for (int i = 1; i < a.length; i++) {
            sum = a[0] + b[i];
            if (sum > max) {
                max = sum;
                bj = i;
            }
        }

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[ai]) {
                for (int j = i; j < b.length; j++) {
                    sum = a[i] + b[j];
                    if (sum > max) {
                        max = sum;
                        ai = i;
                        bj = j;
                    }
                }
            }
        }
        System.out.println(ai + " " + bj);
    }
}

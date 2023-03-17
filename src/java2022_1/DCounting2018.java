package java2022_1;

import java.util.Scanner;

public class DCounting2018 {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        int n = scin.nextInt();
        int k = scin.nextInt();
        int x = 0;
        for (int i = 1; i <= n; i++) {
            x = (x+k) % i;
        }
        System.out.println(x + 1);

    }

}
package java2022_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BArea2018 {
    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        File file = new File("input.txt");
        Scanner scin = new Scanner(file);
        int n = scin.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = scin.nextDouble();
            y[i] = scin.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            sum += (x[i] * y[j]) - (x[j] * y[i]);
        }
        System.out.println(Math.abs(sum / 2));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

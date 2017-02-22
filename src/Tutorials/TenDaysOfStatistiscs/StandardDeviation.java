/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials.TenDaysOfStatistiscs;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class StandardDeviation {

    static double mean(int[] a) {

        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        double average = (double) sum / a.length;
        return average;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        DecimalFormat df = new DecimalFormat("0.0");
        df.setRoundingMode(RoundingMode.DOWN);

        double u = mean(a);
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow((a[i] - u), 2);

        }
        double stdDev = Math.sqrt((sum / n));
        System.out.println(df.format(stdDev));

    }

}

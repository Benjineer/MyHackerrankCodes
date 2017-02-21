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
public class WeightedMean {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
        }
        int sum = 0;
        int nsum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * w[i];
            nsum += w[i];
        }

        DecimalFormat df = new DecimalFormat("0.0");
        df.setRoundingMode(RoundingMode.UP);
        double weightmean = (double) sum / nsum;
        System.out.println(df.format(weightmean));
    }

}

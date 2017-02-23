/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials.TenDaysOfStatistiscs;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class InterQuartileRange {

    static double median(int[] a) {
        Arrays.sort(a);
        double q2;
        if (a.length % 2 != 0) {
            q2 = Math.round((float) a[a.length / 2]);

        } else {
            q2 = Math.round((float) (a[a.length / 2] + a[(a.length / 2) - 1]) / 2);
        }

        return q2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] f = new int[n];
        int sumf = 0;
        for (int i = 0; i < n; i++) {
            f[i] = in.nextInt();
            sumf += f[i];
        }
        int[] x = new int[sumf];
        int xl = 0;
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i]; j++) {
                x[xl] = a[i];
                xl++;
            }

        }
        Arrays.sort(x);
//        float q2 = median(x);
        int[] b = new int[x.length / 2];
        int[] c = new int[x.length / 2];
        b = Arrays.copyOfRange(x, 0, x.length / 2);
        double q1 = median(b);
        double q3;
//        double q3 = median(c);
        if (x.length % 2 != 0) {
            c = Arrays.copyOfRange(x, (x.length / 2) + 1, x.length);
            q3 = median(c);
        } else {
            c = Arrays.copyOfRange(x, (x.length / 2), x.length);
            q3 = median(c);
        }
        DecimalFormat df = new DecimalFormat("0.0");
//        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println(df.format(q3 - q1));

    }

}

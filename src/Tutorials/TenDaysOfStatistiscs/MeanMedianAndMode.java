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
public class MeanMedianAndMode {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        DecimalFormat df = new DecimalFormat("0.0");
        df.setRoundingMode(RoundingMode.UP);
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        double average = (double) sum / n;
        System.out.println(df.format(average));

        Arrays.sort(a);
        if (n % 2 == 0) {
            double median = (a[n / 2] + a[(n / 2) - 1]) / 2.0;
            System.out.println(df.format(median));
        } else {
            double median = a[Math.round((float) (n / 2.0))];
        }

        int[] occurs = new int[n];
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            int occur = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    occur++;
                }

            }
            occurs[i] = occur;

        }

//        for (int i = 0; i < occurs.length; i++) {
//            for (int j = i + 1; j < occurs.length; j++) {
//                if (occurs[i] == occurs[j]) {
//                    if (a[i] < a[j]) {
//                        temp = i;
//                    } else {
//                        temp = j;
//                    }
//                } else if (occurs[i] > occurs[j]) {
//                    temp = i;
//                }
//            }
//        }
        int max = 0;
        for (int i = 0; i < occurs.length; i++) {
            if (occurs[i] > max) {
                max = occurs[i];
                temp = i;
            } else if (occurs[i] == max) {
                if (a[i] < a[temp]) {
                    max = occurs[i];
                    temp = i;
                } else if (a[temp] < a[i]) {
                    max = occurs[temp];
                }
            }
        }

        System.out.println(a[temp]);

    }

}

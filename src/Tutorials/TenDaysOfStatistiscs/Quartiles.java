/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials.TenDaysOfStatistiscs;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class Quartiles {

    static int median(int[] a) {
        Arrays.sort(a);
        int q2;
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

        int q2 = median(a);
        int[] b = new int[n / 2];
        int[] c = new int[n / 2];
        b = Arrays.copyOfRange(a, 0, n / 2);
        int q1 = median(b);
        int q3;
        if(n%2 != 0){
            c = Arrays.copyOfRange(a, (n / 2) + 1, n);
            q3 = median(c);
        }else{
            c = Arrays.copyOfRange(a, (n / 2), n);
            q3 = median(c);
        }

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);

    }

}

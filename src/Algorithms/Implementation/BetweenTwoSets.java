/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Implementation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Benjineer
 */
public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int count = 0;
        List<Integer> factors = new LinkedList<>();
        loop:
        for (int i = 1; i <= 100; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] != 0) {
                    break;
                } else if (j == a.length - 1) {
                    for (int k = 0; k < b.length; k++) {
                        if (b[k] % i != 0) {
                            break;
                        } else if (k == b.length - 1) {
                            count++;
                            factors.add(i);
                        }

                    }
                }

            }

        }
        System.out.println(count);
//        System.out.println(factors.toString());

    }

}

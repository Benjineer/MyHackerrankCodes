/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apples = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apples[apple_i] = a + in.nextInt();
        }
        int[] oranges = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            oranges[orange_i] = b + in.nextInt();
        }

        int noOfApples = 0;
        for (int apple : apples) {
            if ((apple >= s) && (apple <= t)) {
                noOfApples++;
            }
        }
        System.out.println(noOfApples);
        int noOfOranges = 0;
        for (int orange : oranges) {

            if ((orange >= s) && (orange <= t)) {
                noOfOranges++;
            }
        }
        System.out.println(noOfOranges);
    }

}

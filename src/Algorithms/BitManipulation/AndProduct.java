/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.BitManipulation;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class AndProduct {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long a = in.nextInt();
            long b = in.nextInt();
            long ans = a;
            if (a >= 0 && a < 4294967296L && a < b && b < 4294967296L) {
                for (long j = a + 1; j <= b; j++) {
                    ans = ans & j;
                }
                System.out.println(ans);
            }

        }
    }
}

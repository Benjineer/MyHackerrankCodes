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
public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            int h = 1;
//            System.out.println(c[i]);
            for (int j = 2; j < (c[i] + 2); j++) {
                if (j % 2 == 0) {
                    h = h * 2;
                } else {
                    h = h + 1;
                }
//                System.out.println(h);
            }
            System.out.println(h);
        }
    }

}

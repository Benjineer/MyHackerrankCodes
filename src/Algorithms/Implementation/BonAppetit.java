/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Benjineer
 */
public class BonAppetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int b = in.nextInt();
        int totalCost = 0;
        for (int i = 0; i < a.length; i++) {
            if (!(i == k)) {
                totalCost += a[i];
            }

        }

        int actualSharedCost = totalCost / 2;

        if (actualSharedCost == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actualSharedCost);
        }

    }

}

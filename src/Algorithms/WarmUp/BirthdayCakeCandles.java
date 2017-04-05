/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.WarmUp;

import java.util.Scanner;

/**
 *
 * @author NIYI
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
        }
        int tallest = 0;
        for (int i = 0; i < height.length; i++) {
            int j = height[i];
            if (j > tallest) {
                tallest = j;
            }
        }
        int count = 0;
        for (int i = 0; i < height.length; i++) {
            int j = height[i];
            if (j == tallest) {
                count++;
            }
        }
        System.out.println(count);
    }

}

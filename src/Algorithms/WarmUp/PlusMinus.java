/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.WarmUp;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class PlusMinus {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
//            System.out.println(array[i]);

        }

        double neg = 0;
        double pos = 0;
        double zero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                neg++;
            } else if (array[i] > 0) {
                pos++;
            } else {
                zero++;
            }
        }
        double posFrac = pos/n;
        double negFrac = neg/n;
        double zeroFrac = zero/n;
        System.out.println(posFrac);
        System.out.println(negFrac);
        System.out.println(zeroFrac);

    }

}

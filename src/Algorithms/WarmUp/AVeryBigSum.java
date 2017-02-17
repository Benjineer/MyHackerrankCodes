/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.WarmUp;

/**
 *
 * @author Benjineer
 */
public class AVeryBigSum {

    public static void main(String[] args) {
        long n = 5;
        long[] a = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        long l = 0;
        for (int i = 0; i < a.length; i++) {
            l = l + a[i];
        }
        System.out.println(l);

    }

}

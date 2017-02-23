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
public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int count = 0;
            for (int j = a; j <= b; j++) {
                int sqrt = (int)Math.sqrt(j);
                Double squared = Math.pow(sqrt, 2);
                if (squared.intValue() == j) {
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }

}

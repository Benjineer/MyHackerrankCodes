/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.Arrays;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class TwoDArray_DS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] lArray = new int[6][6];
        for (int i = 0; i < lArray.length; i++) {
            for (int j = 0; j < lArray.length; j++) {
                lArray[i][j] = in.nextInt();

            }

        }

        for (int i = 0; i < lArray.length; i++) {
            for (int j = 0; j < lArray.length; j++) {
                for (int k = 0; k < j + 3; k++) {
                    int[] is = lArray[k];

                }

            }

        }

    }

}

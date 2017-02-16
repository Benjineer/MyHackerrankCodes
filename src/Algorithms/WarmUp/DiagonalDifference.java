/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.WarmUp;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        in.nextLine();
        for (int i = 0; i < n; i++) {

            String line = in.nextLine();
            String[] lineRow = line.split(" ");

            int[] row = new int[n];
            for (int j = 0; j < lineRow.length; j++) {
                row[j] = Integer.parseInt(lineRow[j]);
            }

            matrix[i] = row;
        }

        int d1 = 0;
        int d2 = 0;
        for (int i = 0, j = matrix.length - 1; i < matrix.length && j >= 0; i++, j--) {
            d1 = d1 + matrix[i][i];
            d2 = d2 + matrix[i][j];

        }
        System.out.println(Math.abs(d1 - d2));
    }

}

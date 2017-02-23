/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 *
 * @author Benjineer
 */
public class LetsReview {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String string = in.next();
            char[] characters = string.toCharArray();
            String even = "";
            String odd = "";
            for (int j = 0; j < characters.length; j++) {
                if (j == 0) {
                    even += characters[j];
                } else if (j % 2 == 0){
                    even += characters[j];
                }else{
                    odd += characters[j];
                }

            }
            System.out.println(even + " " + odd);
        }
    }

}

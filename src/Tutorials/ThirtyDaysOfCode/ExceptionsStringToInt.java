/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class ExceptionsStringToInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int integer = 0;
        try {
            integer = Integer.parseInt(S);
        } catch (NumberFormatException nfe) {
            System.out.println("Bad String");
        }
        System.out.println(integer);

    }

}

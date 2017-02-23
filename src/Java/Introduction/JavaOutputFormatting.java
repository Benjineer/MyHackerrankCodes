/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Introduction;

import java.util.Scanner;

/**
 *
 * @author Benjineer
 */
public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d %n", s1, x);
//            String.format(s1, args)
        }
        System.out.println("================================");
    }

}

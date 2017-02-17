/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if (x2 > x1 && v2 > v1) {
            System.out.println("NO");
        } else if (x1 > x2 && v1 > v2) {
            System.out.println("NO");
        } else if (x1 == x2 && v1 > v2) {
            System.out.println("NO");
        } else if (x1 == x2 && v2 > v1) {
            System.out.println("NO");
        } else if (v1 == v2 && x1 > x2) {
            System.out.println("NO");
        } else if (v2 == v1 && x2 > x1) {
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }

}

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
public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int z = in.nextInt();
        int k = in.nextInt();
        int beautifulDays = 0;
        for (int i = 0; i < z - a + 1; i++) {
            int next = a + i;
            String string = String.valueOf(next);
            char[] charArray = string.toCharArray();
            String reverseString = "";
            for (int j = charArray.length - 1; j >= 0; j--) {
                char c = charArray[j];
                reverseString += c;
            }
//            System.out.println(reverseString);
            int reversedInt = Integer.parseInt(reverseString);
            int ans = Math.abs(next - reversedInt) % k;
            if (ans == 0) {
                beautifulDays++;
            }
        }
        System.out.println(beautifulDays);
    }

}

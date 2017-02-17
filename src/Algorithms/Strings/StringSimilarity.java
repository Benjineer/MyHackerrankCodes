/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Strings;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class StringSimilarity {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = in.next();
        }

        //iterating through each test case string
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            String[] suffixes = new String[string.length()];
            //obtaining the suffixes of the string
            for (int j = 1; j < string.length(); j++) {
                String suffix = string.substring(string.length() - j);
//                System.out.println(suffix);
                suffixes[j - 1] = suffix;
            }
            suffixes[suffixes.length - 1] = string;
            //obtaining the prefixes of each suffix
            int ssum = 0;
            for (int j = 0; j < suffixes.length; j++) {
                String suffixe = suffixes[j];
//                System.out.println("Suffix " + suffixe);
                int sscore = 0;
                for (int k = 1; k <= suffixe.length(); k++) {
                    String prefix = suffixe.substring(0, k);
//                    System.out.println(prefix);
                    if (string.startsWith(prefix)) {
                        sscore++;
                    }

                }
                ssum = ssum + sscore;

            }
            System.out.println(ssum);
        }
    }

}

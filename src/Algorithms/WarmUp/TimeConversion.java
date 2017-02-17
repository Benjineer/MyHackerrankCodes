/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.WarmUp;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String time12 = in.nextLine();

        if (time12.endsWith("PM")) {
            if (time12.startsWith("12")) {
                String t12 = time12.replace("PM", "");
                System.out.println(t12);
            } else {

                String t12 = time12.replace("PM", "");
                String[] array12 = t12.split(":");
                int firstElement = Integer.parseInt(array12[0]) + 12;
                array12[0] = String.valueOf(firstElement);
                String output = array12[0] + ":" + array12[1] + ":" + array12[2];
                System.out.println(output);
            }
        } else if (time12.endsWith("AM")) {
            if (time12.startsWith("12")) {
                String t12 = time12.replace("AM", "").replace("12", "00");
                System.out.println(t12);
            } else {
                System.out.println(time12.replace("AM", ""));
            }
        }

    }

}

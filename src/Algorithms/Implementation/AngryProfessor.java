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
public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            int nos = in.nextInt();
            int k = in.nextInt();
            in.nextLine();
            String times = in.nextLine();
            String[] atimes = times.split(" ");
            int ics = 0;
            for (int i = 0; i < atimes.length; i++) {
                int atime = Integer.parseInt(atimes[i]);
                if (atime <= 0) {
                    ics++;
                }
            }
            if(ics < k){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}

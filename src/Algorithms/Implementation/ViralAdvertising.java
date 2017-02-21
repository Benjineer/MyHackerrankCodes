/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Benjineer
 */
public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int noOfPeople = 5;
        int likedPeople = 0;
        int sharedPeople = 0;
        for (int i = 0; i < n; i++) {
            likedPeople += noOfPeople / 2;
            sharedPeople = (noOfPeople / 2) * 3;
            noOfPeople = sharedPeople;
        }
        System.out.println(likedPeople);
        
    }

}

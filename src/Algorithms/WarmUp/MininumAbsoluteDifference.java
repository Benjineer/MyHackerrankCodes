/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.WarmUp;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Benjineer
 */
public class MininumAbsoluteDifference {

    public static void main(String[] args) {
        int n = 3;
        int[] a = {3, -7, 0,1};
        List<Integer> diffList = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (i != j) {
                    int diff = a[j] - a[i];
                    diffList.add(Math.abs(diff));
                }

            }
        }

        System.out.println(diffList.toString());

        int smallie = 1000000000;
        for (Integer diff : diffList) {
            if ((diff < smallie)) {
                smallie = diff;
            }
        }
        System.out.println(smallie);

    }

}

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
public class PrefixNeighbours {

    public static void main(String[] args) {
        int q = 3;
        String s = "A B AE";
        String s2 = "AA AB ABD ABDE";

        String[] strings = s2.split(" ");
        List<String> prefixNe = new LinkedList<>();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                String string = strings[i];
                if ( (string.startsWith(strings[j])) && (!string.equalsIgnoreCase(strings[j])) ) {
                    
                    System.out.println(string + " " + strings[j] + " true");
                }else{
                    prefixNe.add(strings[j]);
                }
            }
        }
    }

}

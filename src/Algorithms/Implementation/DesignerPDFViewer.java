/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Implementation;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Benjineer
 */
public class DesignerPDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];

        for (int h_i = 0; h_i < 26; h_i++) {
            h[h_i] = in.nextInt();
        }
        
        TreeMap lettersMap = new TreeMap();
        lettersMap.put('a', h[0]);
        lettersMap.put('b', h[1]);
        lettersMap.put('c', h[2]);
        lettersMap.put('d', h[3]);
        lettersMap.put('e', h[4]);
        lettersMap.put('f', h[5]);
        lettersMap.put('g', h[6]);
        lettersMap.put('h', h[7]);
        lettersMap.put('i', h[8]);
        lettersMap.put('j', h[9]);
        lettersMap.put('k', h[10]);
        lettersMap.put('l', h[11]);
        lettersMap.put('m', h[12]);
        lettersMap.put('n', h[13]);
        lettersMap.put('o', h[14]);
        lettersMap.put('p', h[15]);
        lettersMap.put('q', h[16]);
        lettersMap.put('r', h[17]);
        lettersMap.put('s', h[18]);
        lettersMap.put('t', h[19]);
        lettersMap.put('u', h[20]);
        lettersMap.put('v', h[21]);
        lettersMap.put('w', h[22]);
        lettersMap.put('x', h[23]);
        lettersMap.put('y', h[24]);
        lettersMap.put('z', h[25]);

        String word = in.next();

        int breadth = word.length();

        char[] letters = word.toCharArray();
        List<Integer> heights = new LinkedList<>();
        for (char letter : letters) {
            Integer height = (Integer) lettersMap.get(letter);
            heights.add(height);
        }
        int maxHeight = 0;
        for (Integer height : heights) {
            maxHeight = Math.max(maxHeight, height);
        }
        int area = breadth * maxHeight;
        in.close();
        System.out.println(area);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials.ThirtyDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Benjineer
 */
public class DictionariesAndMaps {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phonebook = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            phonebook.put(in.next(), in.nextInt());
        }
        while (in.hasNext()) {
            String key = in.next();
            Integer phoneNo = phonebook.get(key);
            if (Objects.isNull(phoneNo)) {
                System.out.println("Not found");

            } else {
                System.out.println(key + "=" + phoneNo);
            }
        }
        in.close();
    }

}

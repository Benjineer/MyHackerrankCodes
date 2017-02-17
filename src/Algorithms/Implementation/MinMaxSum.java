/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Implementation;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Benjineer
 */
public class MinMaxSum {

    public static void main(String[] args) {
        List<Long> nums = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        nums.add(in.nextLong());
        nums.add(in.nextLong());
        nums.add(in.nextLong());
        nums.add(in.nextLong());
        nums.add(in.nextLong());

        List<Long> nums2 = new LinkedList<>();
        for (Long num : nums) {
            nums2.add(num);
        }
        long largestNo = 0;
        long maxSum = 0;
        for (int i = 0; i < 4; i++) {
            long max = 0;
            for (Long num : nums) {
                max = Math.max(max, num);
            }
            if (i == 0) {
                largestNo = max;
            }
            maxSum = maxSum + max;
//            System.out.println(max);
            nums.remove(max);

        }
        //System.out.println(maxSum);
        long minSum = 0;
        nums2.remove(largestNo);
        for (Long num2 : nums2) {
            minSum = minSum + num2;
//            System.out.println(minSum);
        }

        System.out.println(minSum + " " + maxSum);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
class Calculator {

    int power(int n, int p) throws Exception {
        if (n < 0) {
            throw new Exception("n and p should be non-negative");
        } else if (p < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            int ans = 1;
            for (int i = 0; i < p; i++) {
                ans = ans * n;
            }
            return ans;
        }
    }
}

public class MoreExceptions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

}

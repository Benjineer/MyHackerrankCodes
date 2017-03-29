/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials.ThirtyDaysOfCode;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DATA INFOSEC
 */
public class QueuesAndStacks {

    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new java.util.LinkedList<>();

    void pushCharacter(char c) {
        stack.push(c);
    }

    void enqueueCharacter(char c) {
        queue.offer(c);
    }

    char popCharacter() {
        return stack.pop();
    }

    char dequeueCharacter() {
        return queue.poll();
    }

    public static void main(String[] args) {
        String input;
        try (Scanner scan = new Scanner(System.in)) {
            input = scan.nextLine();
        }

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesAndStacks p = new QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

}

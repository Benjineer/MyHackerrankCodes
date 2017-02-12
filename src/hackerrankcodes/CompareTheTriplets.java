/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankcodes;

/**
 *
 * @author Benjineer
 */
public class CompareTheTriplets {

    public static void main(String[] args) {
        String aliceScores = "5 6 7";
        String bobScores = "3 6 10";

        String[] aliceArray = aliceScores.split(" ");
        String[] bobArray = bobScores.split(" ");
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < 3; i++) {
            if (Double.parseDouble(aliceArray[i]) > Double.parseDouble(bobArray[i])) {
                aliceScore++;
            }else if (Double.parseDouble(aliceArray[i]) == Double.parseDouble(bobArray[i])) {
                
            }else if (Double.parseDouble(aliceArray[i]) < Double.parseDouble(bobArray[i])) {
                bobScore++;
            }

        }
        
        System.out.println(aliceScore+" "+bobScore);
    }

}

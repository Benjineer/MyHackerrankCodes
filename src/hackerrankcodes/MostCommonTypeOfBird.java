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
public class MostCommonTypeOfBird {

    public static void main(String[] args) {
        int n = 6;
        int[] types = {1, 4, 4, 4, 5, 3};
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;

        for (int type : types) {
            if (type == 1) {
                one++;
            }
            if (type == 2) {
                two++;
            }
            if (type == 3) {
                three++;
            }
            if (type == 4) {
                four++;
            } if(type == 5) {
                five++;
            }
        }
        
        int[] times = {one, two, three, four, five};
        
        int highestNo = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] > highestNo) {
                highestNo = i+1;
//                times[i] = times[i+1];
            }
        }
        
        for (int time : times) {
            if(highestNo == time){
                
            }
        }
        
        System.out.println(highestNo);

    }

}

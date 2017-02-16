/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.WarmUp;

/**
 *
 * @author Benjineer
 */
public class SpellHackerRank {
    
    public static void main(String[] args) {
        
        int q = 2;
        String s1 = "hereiamstackerrank";
        String s = "hackerworld";
       
        char[] charArray = s.toCharArray();

        int h=0,a=0,c=0,k=0,e=0,r=0,n=0;
        
        for (char character : charArray) {
            if(character == 'h'){
                h++;
            }
            if(character == 'a'){
                a++;
            }
            if(character == 'c'){
                c++;
            }
            if(character == 'k'){
                k++;
            }
            if(character == 'e'){
                e++;
            }
            if(character == 'r'){
                r++;
            }
            if(character == 'n'){
                n++;
            }
            
        }
        
        if(h >= 1 && a >= 2 && c >= 1 && k >= 2 && e >= 1 && r >= 2 && n >= 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        
    }
    
}

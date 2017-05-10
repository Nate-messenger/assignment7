/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author nate
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("pleae enter in a number");
        int num = in.nextInt();
        System.out.println(lastDigit(num));
    }
    /**
     * returns the last digit of specified number
     * @param num
     * @return the last digit
     */
    public static int lastDigit(int num){
        //makes number positive
        if (num < 0) {
            num = num*-1;
        }
        //gets last digit
        int digit = num%10;
        return digit;
    }
}

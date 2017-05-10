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
public class A7Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ask for number
        System.out.println("Enter a number you think has all odd numbers");
        int num = in.nextInt();
        allDigitsOdd(num);
    }
/**
 * takes apart the number piece by piece to check for even numbers
 * @param num 
 */
    public static void allDigitsOdd(int num) {
        if (num < 0) {
            num = num * -1;
        }
        //sections the number down to one number then the next number
        for (int i = 0; i < num; i++) {

            int num2 = num % 10;

            if (num2 == 2 || num2 == 4 || num2 == 6 || num2 == 8 || num2 == 0) {
                System.out.println("False");
                break;
            }
            num = num / 10;
            //to check the last number
            if (num == 2 || num == 4 || num == 6 || num == 8 || num == 0) {
                System.out.println("False");
                break;
            }
            if (num / 10 == 0) {
                System.out.println("True");
                
            }
        }
    }
}

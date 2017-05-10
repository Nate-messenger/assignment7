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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what number do you want factors of");
        int num = input.nextInt();
        System.out.println("the factors are");
        factors(num);
        
    }

    //1,2,3,4,6,9,12,18,36,
    public static void factors(int num) {
        for (int i = 1; i <= num; i++) {
            int n = num / i;
            if (num%i == 0) {
                System.out.println(n);
            }

        }

    }
}

package assignment7;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nate
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ask for number
        System.out.println("Enter a number");
        int num = in.nextInt();
        System.out.println(firstDigit(num));
        
    }

    public static int firstDigit(int num) {
        //changes the number to a positive iniger
        if (num < 0) {
            num = num*-1;
        }
        //the number keeps dividing until there is only one number left
        while (num >= 10) {
            num = num / 10;
        }
        //gives final number
        return num;
    }
}

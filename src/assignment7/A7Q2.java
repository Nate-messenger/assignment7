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
public class A7Q2 {
/**
 * prints out grade based on the mark
 * @param mark 
 */
public static void examGrade(double mark){
if (mark < 50) {
   System.out.println("im sorry You got a F");
}
    if (mark >= 50 && mark <= 59) {
        System.out.println("you got a D");
    }
    if (mark >= 60 && mark <= 69) {
        System.out.println("you got a C");
    }
    if (mark >= 70 && mark <= 79) {
        System.out.println("you got a B");
    }if (mark >= 80) {
        System.out.println("congratulations you got a A");
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What was your percentage on the exam?");
        double mark = in.nextInt();
        
        examGrade(mark);
    }
    
}
//< 50       -  F
//50-59    -   D
//60-69    -   C
//70 - 79  -   B
//80+        -  A

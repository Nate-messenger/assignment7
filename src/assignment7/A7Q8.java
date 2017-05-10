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
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // get month and date
        System.out.println("please enter in the month");
        int month = in.nextInt();
        System.out.println("please enter the day");
        int day = in.nextInt();

        season(month, day);
    }

    //12/16 and 3/15, you should return "Winter
    //3/16 and 6/15, you should return "Spring
    // 6/16 and 9/15, you should return"Summer
    //9/16 and 12/15, you should return "Fall
    /**
     * gets month and day then returns season
     * @param month
     * @param day 
     */
    public static void season(int month, int day) {
        if (month >= 12 && month <= 3 && day <= 16 && day <= 15) {
            System.out.println("Winter");
        }
        if (month >= 3 && month <= 6 && day <= 16 && day <= 15) {
            System.out.println("Spring");
        }
        if (month >= 6 && month <= 9 && day <= 16 && day <= 15) {
            System.out.println("Summer");
        }
        if (month >= 9 && month <= 12 && day <= 16 && day <= 15) {
            System.out.println("Fall");
        }
    }

}

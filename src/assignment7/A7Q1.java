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
public class A7Q1 {

    /**
     * gets the radius from the user and returns the area
     *
     * @param radius
     * @return area of the circle
     */
    public static double circleArea(double radius) {

        double rSquared = Math.pow(radius, 2);
        double area = Math.PI * rSquared;
        return area;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the radius");
        double radius = in.nextDouble();

        double A = circleArea(radius);

        System.out.println("the area is " + A);

    }

}

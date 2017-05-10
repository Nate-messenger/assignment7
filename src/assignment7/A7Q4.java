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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter in the inital principal");
        double iPrincipal = in.nextDouble();
        System.out.println("please enter in the intrest");
        double intrest = in.nextDouble();
        System.out.println("please enter in the amount of years");
        int year = in.nextInt();

        double ci = compoundInterest(iPrincipal, intrest, year);
        System.out.println(ci);
    }

    //B=P(1+r)^n
    /**
     * gets the final amount in the account after interest
     * @param iprincapal
     * @param interest
     * @param year
     * @return the final balance
     */
    public static double compoundInterest(double iPrincipal, double interest, int year) {

        double balance1 = Math.pow((1 + interest), year);
        
        double balance2 = iPrincipal * balance1;
       
        return balance2;
    }
}

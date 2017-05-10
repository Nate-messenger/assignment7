/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author nate
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            chaotic();

        }
        System.out.println("");
    }
/**
 * gives random number then prints out a line of *'s
 */
    public static void chaotic() {
        int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;

        for (int j = 0; j < randNum; j++) {
            System.out.print("*");
        }
    }
}

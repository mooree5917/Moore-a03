/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Eric Moore
 * Write a program that prompts the user for five numbers and computes the total of the numbers.
 * This must use repetition.
 */
package baseline;

import java.util.Scanner;

public class solution28 {
    public static void main(String[] args){
        {
            int i,n=0,s=0;
            {

                System.out.println("Input the 5 numbers : ");

            }
            //Take in 5 numbers from the user.
            for (i=0;i<5;i++)
            {
                Scanner in = new Scanner(System.in);
                //n represents number.
                n = in.nextInt();

                //s represents sum.
                s +=n;
            }
            System.out.println("The total is : " +s);

        }
    }
}

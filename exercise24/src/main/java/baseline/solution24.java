package baseline;/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solution
 *  Copyright 2021 Eric Moore
 */
/*
Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example that follows.
Implement the program using a function called isAnagram,
which takes in two words as its arguments and returns true or false.
 */
import java.util.Arrays;
import java.util.Scanner;

package baseline;

public class solution24 {
    static boolean isAnagram(String str1, String str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String[] args)
    {

        //Get the first anagram.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first String");
        String str1 = sc.next();

        System.out.println("Enter your second String");
        String str2 = sc.next();

        if (isAnagram(str1, str2))
            System.out.println(str1 + "and" + str2 + "are anagrams");
        else
            System.out.println(str1 + "and " + str2 + "are not anagrams");
    }


}

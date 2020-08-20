package org.example;

public class Main {
    public static void main(String[] args){
        System.out.println("Sum of the first 100 numbers is " + Sum.calculateSum(100));

        int[] a = new int[]{5, 3, 4, 6, 1};
        System.out.println("Smallest number: " + SmallestNumber.smallestNumberArray(a));

        System.out.println("Maximum digit of the number is " + Max.maximumDigit(56248));

        System.out.println("Is the number a palindrom? --> " + Palindrom.checkPalindrom(1221));

        System.out.println("Display all the prime numbers below the number: ");
        Prime.displayPrimesBelow(15);

    }
}

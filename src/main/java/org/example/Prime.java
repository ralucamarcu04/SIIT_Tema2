package org.example;

public class Prime {
    public static boolean checkPrime(int n) {
        if (n <= 1)
            System.out.println("Not a valid number.");
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void displayPrimesBelow(int n){
        for (int i=2; i<n; i++) {
            if (checkPrime(i)==true)
                System.out.println(i + " ");
        }
    }
}
package org.example;

public class SmallestNumber {
    public static int smallestNumberArray(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
}


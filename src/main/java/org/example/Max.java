package org.example;

public class Max {
    public static int maximumDigit(int nr) {
        int max = 0;
        while (nr != 0) {
            if (max < nr % 10) {
                max = nr % 10;
            }
            nr = nr / 10;
        }
        return max;
    }
}

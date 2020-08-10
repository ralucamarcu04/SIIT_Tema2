package org.example;

public class Sum {
    public static int calculateSum(int n) {
        int i = 1;
        int s = 0;
        while (i <= n) {
            s = s + i;
            i++;
        }
        return s;
    }
}

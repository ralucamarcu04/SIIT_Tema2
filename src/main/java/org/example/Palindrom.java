package org.example;
import java.util.ArrayList;

public class Palindrom{
    public static boolean checkPalindrom(int nr){
    ArrayList<Integer> arrayDigits = new ArrayList<>();
    int i=0;
    Integer a;
    while (nr!=0)
    {
        a = nr % 10;
        nr=nr/10;
        arrayDigits.add(i,a);
        i++;
    }
    int length = arrayDigits.size();
    int y = length-1;
    for (int j=0;j<length||j<y;j++){
        if (arrayDigits.get(j)!=arrayDigits.get(y))
            return false;
        y--;
    }
    return true;
    }
}

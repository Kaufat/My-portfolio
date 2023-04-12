package ru.Kain;

public class PalindromeMethods {
    public static boolean checkIsPalindrome (int valueNumber){
        String value = Integer.toString(valueNumber);
        StringBuilder number = new StringBuilder(value);

        return number.toString().equals(number.reverse().toString());

    }
}

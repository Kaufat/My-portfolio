package ru.Kain;

import static ru.Kain.PalindromeMethods.checkIsPalindrome;

public class Main {
    public static void main(String[] args) {

        if (checkIsPalindrome(101)) {
            System.out.println("Число-палиндром");
        } else {
            System.out.println("Число-не палиндром");
        }
    }

    }

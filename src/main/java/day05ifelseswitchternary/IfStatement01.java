package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Example 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Sayı positifdir");
        } else if (number < 0) {
            System.out.println("Sayı negatifdir");
        }else {
            System.out.println("Sayı nötrdür");
        }


    }
}

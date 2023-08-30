package day04;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");

        int number = input.nextInt();
        if (number%2==0){
            System.out.println("sayı çiftdir");
        }else {
            System.out.println("Sayı tekdir");
        }
    }
}

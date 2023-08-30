package day04ıfstatements;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {
        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfem bir sayı giriniz");

        int number = input.nextInt();


        if (number>99 && number<1000){
            System.out.println("Sayı üç basamaklıdır");
        }else {
            System.out.println("Sayı üç basamklı değildir");
        }


    }
}

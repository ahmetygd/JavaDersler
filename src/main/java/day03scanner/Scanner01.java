package day03scanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfem 5 basamaklı bir sayı giriniz");

        int number = input.nextInt();

        int firstTwo = number / 1000;
        int lastTwo = number % 100;

        int sum = firstTwo + lastTwo;
        System.out.println("sum = " + sum);


    }
}

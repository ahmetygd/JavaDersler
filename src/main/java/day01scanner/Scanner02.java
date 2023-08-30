package day01scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        System.out.println("Toplama= "+ (number1+number2));
        System.out.println("Çıkarma= "+ (number1-number2));
        System.out.println("Çarpma= "+ (number1*number2));
        System.out.println("Bölme= "+ (number1/number2));





    }

}

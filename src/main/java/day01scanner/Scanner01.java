package day01scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
/*
       Ornek:  Kullanıcıdan
       i)Adini ve Soyadini
       ii)Yaşını
       iii)Boyunu
       iv)kilosunu
       v) medeni durumunu girmesini isteyin
       Ardından bunları bir etiketle konsolda farklı satırlarda
       yazdırın
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Adınızı Ve Soyadınızı Giriniz");
        String nameSurname = input.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz");
        int age = input.nextInt();

        System.out.println("Lütfen Boyunuzu Giriniz");
        double height = input.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz");
        int weight = input.nextInt();

        System.out.println("Lütfen Medeni Durumunuzu Giriniz");
        String marriage = input.next();

        System.out.println("nameSurname = " + nameSurname);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("marriage = " + marriage);

    }
}

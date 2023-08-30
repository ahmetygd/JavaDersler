package day02;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dikdörkeninizin 2 kenar uzunluğunu giriniz ");

         double shortEdge = input.nextDouble();
         double longEdge = input.nextDouble();

         double alan = shortEdge * longEdge;
         double cevre = (shortEdge * 2) + (longEdge * 2);

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);

    }
}

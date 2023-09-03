package day06switchternarystring;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
//Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin
//           isimlerini yazdiran kodu yaziniz.
//           8 ==> August - September - October - November - December

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch (number){

            case 1:
                System.out.println("ocak");
            case 2:
                System.out.println("şubat");
            case 3:
                System.out.println("mart");
            case 4:
                System.out.println("nisan");
            case 5:
                System.out.println("mayıs");
            case 6:
                System.out.println("haziran");
            case 7:
                System.out.println("temmuz");
            case 8:
                System.out.println("ağuston");
            case 9:
                System.out.println("eylül");
            case 10:
                System.out.println("ekim");
            case 11:
                System.out.println("kasım");
            case 12:
                System.out.println("aralık");
            default:
                System.out.println("Lütfen geçerli ay numarası giriniz");
                break;

        }

    }
}

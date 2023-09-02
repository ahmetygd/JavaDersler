package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen haftanın kaçıncı günü olduğunu tam sayı olarak giriniz");

        int dayNumber = input.nextInt();

        if (dayNumber == 1){
            System.out.println("Pazar");
        } else if (dayNumber == 2) {
            System.out.println("Pazartesi");
        } else if (dayNumber == 3) {
            System.out.println("Salı");
        } else if (dayNumber == 4) {
            System.out.println("Çarşamba");
        } else if (dayNumber == 5) {
            System.out.println("Perşembe");
        } else if (dayNumber == 6) {
            System.out.println("Cuma");
        } else if (dayNumber == 7) {
            System.out.println("Cumartesi");
        }else {
            System.out.println("Lütfen birden yediye kadar olan rakamları giriniz");
        }


    }
}

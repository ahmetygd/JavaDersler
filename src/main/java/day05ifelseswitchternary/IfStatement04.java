package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        /*
        Kullanicinin vermis oldugu gün isimlerine bakarak HaftaSonu veya Hafta ici olduguna karar veren kodu yaziniz
                   Monday ==> Week Day       Saturday ==> Weekend Day*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen haftanın günlerini giriniz. Örnek : Monday Tuesday Wednesday Thursday Friday Saturday Sunday ");

        String day = input.next();

        boolean isWeekend =
                day.equalsIgnoreCase("sunday") ||
                day.equalsIgnoreCase("saturday");

        boolean isWeekday =
                day.equalsIgnoreCase("Monday") ||
                day.equalsIgnoreCase("Tuesday") ||
                day.equalsIgnoreCase("Wednesday") ||
                day.equalsIgnoreCase("Thursday")||
                day.equalsIgnoreCase("Friday");
        if (isWeekend) {
            System.out.println("Weekend Day");
        } else if (isWeekday) {
            System.out.println("Week Day");
        }else {
            System.out.println("Lütfen geçerli gün ismi giriniz");
        }



    }
}

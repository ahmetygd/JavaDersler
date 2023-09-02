package day05ifelseswitchternary;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

//Example  Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
//  Sunday==>1 . Saturday==>7
        Scanner input = new Scanner(System.in);
        System.out.println("Haftanın herhangi bir gününü giriniz : Monday Tuesday Wednesday Thursday Friday Saturday Sunday ");

        String dayName = input.next();

        if (dayName.equalsIgnoreCase("Monday") ){
            System.out.println("1");
        } else if (dayName.equals("Tuesday")) {
            System.out.println("2");
        } else if (dayName.equals("Wednesday")) {
            System.out.println("3");
        } else if (dayName.equals("Thursday")) {
            System.out.println("4");
        } else if (dayName.equals("Friday")) {
            System.out.println("5");
        } else if (dayName.equals("Saturday")) {
            System.out.println("6");
        } else if (dayName.equals("Sunday")) {
            System.out.println("5");
        }else {
            System.out.println("Lütfen geçerli bir gün giriniz");
        }

    }
}

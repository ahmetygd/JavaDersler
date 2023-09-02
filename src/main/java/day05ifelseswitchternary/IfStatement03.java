package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        /*
             Example 3:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı tam sayı olarak giriniz");

        int yas = input.nextInt();

        if (yas < 5 && yas > -1) {
            System.out.println("bebek");
        } else if (yas < 13 && yas > 4) {
            System.out.println("cocuk");
        } else if (yas < 21 && yas > 12) {
            System.out.println("genc");
        } else if (yas < 31 && yas > 20) {
            System.out.println("yetiskin");
        } else if (yas > 30) {
            System.out.println("Tanimlanmamis");
        }else {
            System.out.println("Gecerli bir yas giriniz");
        }

    }
}

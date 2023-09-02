package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
  /*Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

   Eger calisan kadin ise;

   60 yasindan buyukse "Emekli Olabilir "yazdirin

   Eger calisan erkek ise;
   65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz*/


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz");
        String cinsiyet = input.next();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = input.nextInt();

        if (yas > 0 && yas < 120){
            boolean isCenderMan = cinsiyet.equalsIgnoreCase("erkek");
            boolean isCenderWoman = cinsiyet.equalsIgnoreCase("kadın");


            if (isCenderMan){
                if (yas > 65){
                    System.out.println("Emekli olabilirsiniz");
                }else {
                    System.out.println("Emekli olamazsınız");
                }
            } else if (isCenderWoman) {
                if (yas > 60 ){
                    System.out.println("Emekli olabilirsiniz");
                }else {
                    System.out.println("Emekli olamazsınız");
                }
            }else {
                System.out.println("Doğru cinsiyet giriniz");
            }


        } else {
            System.out.println("Lütfen geçerli bir yaş giriniz");
        }












    }
}

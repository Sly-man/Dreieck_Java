package interviewPractices;

import java.util.Scanner;

public class Dreieck_3000 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci kenar uzunlugunu giriniz");
        byte a = input.nextByte();


        System.out.println("Lütfen ikinci kenar uzunlugunu giriniz");
        byte b = input.nextByte();


        System.out.println("Lütfen ücüncü kenar uzunlugunu giriniz");
        byte c = input.nextByte();


        if ((a<b+c && b<a+c && c<a+b) && (a>Math.abs(b-c) && b>Math.abs(a-c) && c>Math.abs(a-b))) {
            if (a==b && b==c ){
                System.out.println("Eskenar ücgen");
            }else if (a!=b && b!=c && a!=c) {
                System.out.println("Cesitkenar ücgen");
            } else if (a==b || b==c || a==c) {
                System.out.println("Ikizkenar ücgen");
            }
        }else {
            System.out.println("Ücgen cizilemez");
        }


       }


}

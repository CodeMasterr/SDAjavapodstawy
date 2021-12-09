package sda_java_zadania_1.zadanie5;

import java.util.Scanner;

public class TrojkatMain {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sprawdz czy trojkat jest prostokatny, podaj 1 bok");
        a = scan.nextInt();
        System.out.println("Podaj 2 bok");
        b = scan.nextInt();
        System.out.println("Podaj 3 bok");
        c = scan.nextInt();
        Trojkat trojkat = new Trojkat(a,b,c);
        if(trojkat.CzyProstokatny()){
            System.out.println("Trojkat jest prostokatny");
        }
        else
        {
            System.out.println("Trojkat nie jest prostokatny");
        }
    }
}

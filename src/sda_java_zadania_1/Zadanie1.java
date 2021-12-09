package sda_java_zadania_1;

import java.util.Scanner;

public class Zadanie1 {
    //Zadanie1
    //Napisz program, który sprawdza czy ciąg znaków jest palindromem.
    public static void main(String[] args) {
        String tekst = new String();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ciag znakow, aby sprawdzic czy jest polindromem");
        tekst = scan.nextLine();
        Zadanie1Polindrom polindrom = new Zadanie1Polindrom(tekst);
        System.out.println(polindrom.tekst);
        polindrom.CzyPolindrom();
    }

}

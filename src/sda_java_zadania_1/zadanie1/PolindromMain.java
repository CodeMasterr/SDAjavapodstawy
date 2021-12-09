package sda_java_zadania_1.zadanie1;

import java.util.Scanner;

public class PolindromMain {
    //Zadanie1
    //Napisz program, który sprawdza czy ciąg znaków jest palindromem.
    public static void main(String[] args) {
        String tekst;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ciag znakow, aby sprawdzic czy jest polindromem");
        tekst = scan.nextLine();
        Polindrom polindrom = new Polindrom(tekst);
        System.out.println(polindrom.tekst);
        polindrom.CzyPolindrom();
    }

}

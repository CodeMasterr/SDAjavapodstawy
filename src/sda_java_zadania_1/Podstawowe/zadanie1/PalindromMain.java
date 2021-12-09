package sda_java_zadania_1.Podstawowe.zadanie1;

import java.util.Scanner;

public class PalindromMain {
    //Zadanie1
    //Napisz program, który sprawdza czy ciąg znaków jest palindromem.
    public static void main(String[] args) {
        String tekst;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ciag znakow, aby sprawdzic czy jest polindromem");
        tekst = scan.nextLine();
        Palindrom palindrom = new Palindrom(tekst.replaceAll(" ", ""));
        System.out.println(palindrom.czyPolindrom());

        if(palindrom.czyPolindrom()){
            System.out.println("Ciag jest palindromem");
        }
        else
        {
            System.out.println("Ciag nie jest palindromem");
        }
    }

}

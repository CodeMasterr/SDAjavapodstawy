package sda_java_zadania_1.Srednie.Zadanie1;

import java.util.Arrays;

public class TablicaMain {
    public static void main(String[] args) {
        Tablica tablica = new Tablica();
        tablica.wyswietl();
        System.out.println("Wartosc najczestsza to :"+ tablica.wybierz());
    }

}

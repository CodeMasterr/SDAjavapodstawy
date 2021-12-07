package dzien11;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int min;
    private int max;
    private int liczba;
    private int iloscProb;

    public void lunchGame(){
        Scanner scanner = new Scanner(System.in);
        int kontynuacja = 1;
        while (kontynuacja == 1) {
            prepareGame();
            runGame();
            System.out.println("Czy chcesz kontynuowac? Podaj 1 albo 0");
            kontynuacja = scanner.nextInt();
        }

    }
    private void prepareGame() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Witaj w programie do zgadywania liczb, aby zaczac grę naleze podac zakres");
        System.out.println("Podaj minimum:");
        min = scan.nextInt();
        System.out.println("Podaj max:");
        max = scan.nextInt();
        liczba = random.nextInt(max - min) + min;
        //System.out.println(liczba);
        iloscProb = 0;
    }

    private void runGame() {
        int test;
        Scanner scan = new Scanner(System.in);
        while (iloscProb < 5) {
            System.out.println("Zgadnij liczbe");
            test = scan.nextInt();
            if (test == liczba) {
                System.out.println("Gratulacje, zgadles");
                iloscProb = 5;
            } else {
                iloscProb++;
                if (iloscProb == 5) {
                    System.out.println("Przegrales,szukana liczba to :" + liczba);
                } else {
                    if (test > liczba)
                        System.out.println("Pudlo, szukana liczba jest mniejsza od podanej");
                    else
                        System.out.println("Pudlo, szukana liczba jest wieksza od podanej");
                }
            }
        }

    }
}

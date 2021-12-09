package sda_java_zadania_1.Srednie.Zadanie2;

import java.util.Random;

public class Tablica {
    int[][] tablica = new int[3][3];
    int suma=0;

    public Tablica Losuj() {
        int liczba;
        int min = 10;
        int max = 99;
        Random random = new Random();

        for( int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 3 ; j++){
                tablica[i][j] = random.nextInt(max - min) + min;
                if(j>=i) suma+=tablica[i][j];
            }
        }
        return this;
    }

    public Tablica(){
        this.Losuj();
    }

    public void wyswietl() {
        for( int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(tablica[i][j]+" ");
            }
            System.out.println();
        }
    }
}

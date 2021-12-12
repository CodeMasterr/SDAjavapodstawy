package sda_java_zadania_1.Srednie.Zadanie1;

import java.util.Arrays;
import java.util.Random;

public class Tablica {
    int[] tablica;

    public Tablica losuj() {
        int size;
        int max = 1000;
        Random random = new Random();

        size = random.nextInt(50);
        tablica = new int[size];
        for (int i = 0; i < size; i++) {
            tablica[i] = random.nextInt(50);
        }
        return this;
    }

    public Tablica() {
        this.losuj();
    }

    public int wybierz() {
        int top = 0;
        int topPos =0;
        Arrays.sort(tablica);
        int[] temp = new int[50];


        for(int i = 0; i < tablica.length; i++){
            temp[tablica[i]]+=1;
        }

        top = temp[0];
        for(int i = 1; i < temp.length; i++){
            if(top<temp[i]){
                top = temp[i];
                topPos = i;
            }
        }

        return topPos;
    }

    public void wyswietl() {
        System.out.println("Rozmiar tablicy:" + tablica.length);

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
}

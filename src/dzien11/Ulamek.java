package dzien11;

import java.util.Scanner;

public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek intro() {
        int licz, mian, blad = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj prosze licznik ulamka");
        licz = scan.nextInt();
        System.out.println("Podaj prosze mianownik ulamka");
        mian = scan.nextInt();
        Ulamek ulamek = new Ulamek(licz, mian);
        return ulamek;
    }

    public Ulamek(int l, int m) {
        this.licznik = l;
        this.mianownik = m;
    }

    public Ulamek dodawanie(Ulamek a) {
        if (this.mianownik == a.mianownik)
            this.licznik = this.licznik + a.licznik;
        else {
            this.licznik = this.licznik * a.mianownik + a.licznik * this.mianownik;
            this.mianownik = this.mianownik * a.mianownik;
        }
        return this;
    }

    public Ulamek odejmowanie(Ulamek a) {
        this.licznik = this.licznik * a.mianownik - a.licznik * this.mianownik;
        this.mianownik = this.mianownik * a.mianownik;
        return this;
    }

    public Ulamek mnozenie(Ulamek a) {
        this.licznik = this.licznik * a.licznik;
        this.mianownik = this.mianownik * a.mianownik;
        return this;
    }

    public Ulamek dzielenie(Ulamek a) {
        Ulamek b = new Ulamek(a.mianownik, a.licznik);
        this.mnozenie(b);
        return this;
    }

    public void wyswietl() {
        System.out.println("ulamek niewlasciwy:" + licznik + "/" + mianownik);
        if (licznik % mianownik != licznik) {
            if (licznik % mianownik == 0)
                System.out.println("Ulamek wlasciwy:" + licznik / mianownik);
            else
                System.out.println("Ulamek wlasciwy:" + licznik / mianownik + licznik % mianownik + "/" + mianownik);

        }

    }
}
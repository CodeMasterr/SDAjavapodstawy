package Zadania.ZadaniaZObiektowosci;

public class zad1 {
    public static void main(String[] args) {
        SalaLekcyjna sala1 = new SalaLekcyjna();
        SalaLekcyjna sala2 = new SalaLekcyjna();
        sala1.nazwa = "biologiczna";
        sala1.numerSali = 1;
        sala2.nazwa = "matematyczna";
        sala2.numerSali = 12;
        sala1.wypiszDaneSali();
        sala2.wypiszDaneSali();
    }
}

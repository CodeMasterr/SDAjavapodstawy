package sda_java_zadania_1.Podstawowe.zadanie1;

public class Palindrom {
    String tekst;

    public Palindrom(String wejscie){
        tekst = wejscie;
    }

    public boolean czyPolindrom() {
        //przepisanie do char tabeli
        char[] table = new char[this.tekst.length()];
        for (int i = 0; i < this.tekst.length(); i++) {

            table[i] = this.tekst.charAt(i);
        }

        for (int i=0 ; i < this.tekst.length()/2; i++)
        {
            if (table[i] != table[(table.length-1)-i])
            {
                return false;
            }
        }
        return true;
    }
}

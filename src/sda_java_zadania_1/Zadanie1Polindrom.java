package sda_java_zadania_1;

public class Zadanie1Polindrom {
    String tekst;

    public Zadanie1Polindrom(String wejscie){
        tekst = wejscie;
    }

    public void CzyPolindrom() {
        boolean znaleziono = false;
        //przepisanie do char tabeli
        char[] table = new char[this.tekst.length()];
        for (int i = 0; i < this.tekst.length(); i++) {
            table[i] = this.tekst.charAt(i);
        }

        for (int i=0 ; (i < this.tekst.length()/2) &&!znaleziono; i++)
        {
            if (table[i] == table[(table.length-1)-i])
            {
                znaleziono = false;
            }
            else
            {
                znaleziono = true;
                System.out.println("Podany ciag nie jest polindromem");
            }
        }
        if(!znaleziono){
            System.out.println("Podany ciag jest polindromem");
        }
    }
}

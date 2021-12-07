package dzien11;


public class mainUlamek {
    public static void main(String[] args) {

        Ulamek ulamek = new Ulamek(10,5);
        Ulamek ulamek1 = new Ulamek(1,3);
        ulamek.wyswietl();
        ulamek.mnozenie(ulamek1);
        ulamek.wyswietl();
        ulamek.dzielenie(ulamek1);
        ulamek.wyswietl();
    }
}

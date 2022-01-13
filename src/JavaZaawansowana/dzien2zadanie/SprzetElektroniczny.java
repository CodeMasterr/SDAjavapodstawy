package JavaZaawansowana.dzien2zadanie;

public abstract class SprzetElektroniczny {
    String nazwa;
    int cena;

    SprzetElektroniczny(String nazwa,int cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public void getNazwa(){
        System.out.println(nazwa);
    }
    public void getCena(){
        System.out.println(cena);
    }

    void broke(){
        System.out.println("Telefon zepsuty");
    }

}

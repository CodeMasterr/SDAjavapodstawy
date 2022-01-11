package Zadania.ZadaniaZObiektowosci;

public class Samochod {
    String nazwa;
    int predkosc;

    void wypiszInformacjeOSamochodzie(){
        System.out.println(nazwa + " "+ predkosc);
    }
    void przyspiesz05kmh(){
        predkosc = predkosc+5;
    }
    void zwolnij05kmh(){
        if(predkosc>5){
            predkosc = predkosc-5;
        }
        else{
            predkosc = predkosc-5;
        }

    }
}

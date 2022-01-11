package JavaZaawansowana.dzien1;

public class Opel extends Car{

    Opel(String model, String color){
        super(model,color);
    }
    @Override
    void drive() {
        System.out.println("Jedzie opel");
    }
}

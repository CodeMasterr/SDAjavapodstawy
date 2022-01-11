package JavaZaawansowana.dzien1;

public class BMW extends Car{

        private int wheeldiameter;
    BMW(String model, String color, int wheeldiameter){
        super(model,color);
        this.wheeldiameter = wheeldiameter;
    }
    @Override
    void drive() {
        System.out.println("jedzie BMW");
    }
}

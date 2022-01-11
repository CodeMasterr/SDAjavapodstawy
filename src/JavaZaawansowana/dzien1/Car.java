package JavaZaawansowana.dzien1;

public abstract class Car {
    private String model;
    private String color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    abstract void drive();

    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
}

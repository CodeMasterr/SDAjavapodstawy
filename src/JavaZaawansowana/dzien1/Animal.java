package JavaZaawansowana.dzien1;

public abstract class Animal {
    int age;
    String name;

    void run(){
        System.out.println("Biegne");
    }

    public abstract Cat raise();

    abstract void eat();

    abstract void drink();

}

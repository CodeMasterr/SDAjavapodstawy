package JavaZaawansowana.dzien1;

public abstract class Animal {
    int age;
    String name;

    void run(){
        System.out.println("Biegne");
    }
    abstract void eat();

    abstract void drink();

}

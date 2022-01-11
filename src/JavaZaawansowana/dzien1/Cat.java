package JavaZaawansowana.dzien1;

public class Cat extends Animal implements Flying<Dog>{

    void mrucz(){
        System.out.println("Mrrrr");
    }
    @Override
    void eat(){

    }

    @Override
    void drink(){

    }

    @Override
    public Dog raise() {
        return new Dog();
    }

    @Override
    public void land() {

    }

    class Fur {
        String color="pink";
        int length;
    }

    static class Wisker{
        int length = 5;
        String color;
    }
}

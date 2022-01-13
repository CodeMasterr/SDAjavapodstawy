package JavaZaawansowana.dzien1;

public class Cat extends Animal implements Flying<Cat>{

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
    public Cat raise() {
        return new Cat();
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

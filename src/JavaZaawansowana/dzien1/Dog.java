package JavaZaawansowana.dzien1;

public class Dog extends Animal implements Flying<Cat>{

    void warcz(){
        System.out.println("Grrr");
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
}

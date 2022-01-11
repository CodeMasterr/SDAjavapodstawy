package JavaZaawansowana.dzien1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();

        Cat cat = new Cat();
        cat.run();
        cat.mrucz();

        Cat.Fur fru = new Cat().new Fur();
        System.out.println(fru.color);

        Cat.Wisker wisker = new Cat.Wisker();
        System.out.println(wisker.length);

        Animal rabbit = new Animal() {
            @Override
            public Cat raise() {
                return new Cat();
            }

            @Override
            public void land() {

            }

            @Override
            void eat() {
                System.out.println("rabbit is eating");
            }

            @Override
            void drink() {
                System.out.println("rabbit is drinking");
            }
        };
        rabbit.eat();
        rabbit.drink();

        Flying  flyingCat = new Cat();

    }
}

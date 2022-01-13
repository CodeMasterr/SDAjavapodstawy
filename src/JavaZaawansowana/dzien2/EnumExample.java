package JavaZaawansowana.dzien2;

public class EnumExample {
    public static void main(String[] args) {
        Coffee coffeeLatte = Coffee.ESPRESSO;
        System.out.println(coffeeLatte);

        Coffee coffee = Coffee.LATTE;
        System.out.println(coffee);

        for (Coffee coffie: Coffee.values()){
            System.out.println(coffie.name()+ " mleko: "+coffie.getMilk());
        }

        Season season = Season.SPRING;



    }

    static void seasonMethod(Season season){

    }

}

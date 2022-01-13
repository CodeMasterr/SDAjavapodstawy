package JavaZaawansowana.dzien2;

public enum Coffee {
        LATTE(10, Roast.BLOND, 5),
        ESPRESSO(0, Roast.DARK, 6),
        AMERICANO(5, Roast.MEDIUM, 10),
        CAPPUCINO(7,Roast.MEDIUM,15);


        private final int milk;
        private final Roast roast;
        private final int price;

        Coffee(int milk, Roast roast, int price) {
                this.milk = milk;
                this.roast = roast;
                this.price = price;
        }

        public int getMilk(){return milk;}
        public Roast getRoast(){return roast;}

        public void getCoffiePrice(){
                int generalPrice = 10 * milk + price;
                System.out.println(generalPrice);
        }
}

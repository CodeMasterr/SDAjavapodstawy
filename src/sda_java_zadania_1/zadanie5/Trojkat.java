package sda_java_zadania_1.zadanie5;

public class Trojkat {
    int a;
    int b;
    int c;

    public Trojkat(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean czyProstokatny() {
        return b * b + c * c == a * a || a * a + c * c == b * b || b * b + a * a == c * c;
    }

    public void czyProstokatnyTemp() {
        if (a + b > c && b + c > a & c + a > b) {
            if (a > b) {
                if (a > c) {//a najdluzszy
                    if (b * b + c * c == a * a) {
                        System.out.println("To jest trojkat prostokatny");
                    } else {
                        System.out.println("To nie jest trojkat prostokatny");
                    }
                } else {//c najdluzszy
                    if (b * b + a * a == c * c) {
                        System.out.println("To jest trojkat prostokatny");
                    } else {
                        System.out.println("To nie jest trojkat prostokatny");
                    }
                }
            } else if (b > c) {//b najdluzszy
                if (a * a + c * c == b * b) {
                    System.out.println("To jest trojkat prostokatny");
                } else {
                    System.out.println("To nie jest trojkat prostokatny");
                }
            } else {//c najdluzszy
                if (b * b + a * a == c * c) {
                    System.out.println("To jest trojkat prostokatny");
                } else {
                    System.out.println("To nie jest trojkat prostokatny");
                }
            }
        } else {
            System.out.println("To nie jest trojkat");
        }
    }
}

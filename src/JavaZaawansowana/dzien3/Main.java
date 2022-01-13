package JavaZaawansowana.dzien3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Franek", "Nowak",1);
        Student student2 = new Student("Janek", "Kowal",2);
        Student student3 = new Student("Franek", "Nowak",1);
        Student student4 = new Student("Emil", "Malinowski",3);
        Student student5 = new Student("Maciej", "Nowak",1);

        Map<Student, String> mapaSt = new HashMap<>();

        String name = mapaSt.get(student1);
        mapaSt.put(student1, "Hej to ja franek");
        mapaSt.put(student2, "Hej to ja janek");
        mapaSt.put(student3, "Hej to ja franek");
        mapaSt.put(student4, "Hej to ja emil");
        mapaSt.put(student5, "Hej to ja maciek");

        String opis = mapaSt.get(student3);
        System.out.println(opis.toString());

        /*for (Student key : mapaSt.values()) {
            System.out.println("info: " + key);
        }*/

        /*for (String key : mapaSt.values()) {
            System.out.println("info: " + key);
        }*/

        mapaSt.remove(student1);

        for (Map.Entry<Student, String> pair : mapaSt.entrySet()) {
            System.out.println(pair);
        }
    }
}

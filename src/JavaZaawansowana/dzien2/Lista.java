package JavaZaawansowana.dzien2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Pierwszy");
        lista.add("Drugi");
        lista.add("Trzeci");
        lista.add("trzeci");
        for (String element:lista){
            System.out.println(element);
        }
        lista.remove("Drugi");
        System.out.println(lista.isEmpty());
        System.out.println(lista.contains("Trzeci"));
        System.out.println(lista.containsAll(Arrays.asList("Pierwszy","Czwarty")));
        lista.removeAll(Arrays.asList("Pierwszy","Trzeci"));
        System.out.println(lista);
        System.out.println(lista.isEmpty());
    }
}

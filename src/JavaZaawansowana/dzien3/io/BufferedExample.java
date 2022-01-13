package JavaZaawansowana.dzien3.io;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

public class BufferedExample {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("TODO.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("user_output.txt"));

        String line;
        int i = 0;
        ArrayList<String> list = new ArrayList<>();

        while ((line = in.readLine()) != null){
            if(i%2==0)list.add(line + " wykonane");
            else list.add(line + " do zrobienia");
            out.write(list.get(i) + "\n");
            i++;
            //System.out.println(i+" "+ line);
        }


        out.close();
    }
}

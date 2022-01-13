package JavaZaawansowana.dzien3.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToDo {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("TODO.txt");
        FileWriter out = new FileWriter("user_output.txt");

        ArrayList<String> list = new ArrayList<>();

        /*int nextChar;
        String tekst;
        while((nextChar = in.read()) != -1){
            while(nextChar!= 13 || nextChar != 10){
              tekst = tekst + (char)nextChar;
            }
            //out.write((char) nextChar);
            //System.out.println((char)nextChar);
        }*/

        out.close();
    }
}

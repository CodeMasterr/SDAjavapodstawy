package JavaZaawansowana.dzien3.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaders {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("user.txt");
        FileWriter out = new FileWriter("user_output.txt");

        int nextChar;
        while((nextChar = in.read()) != -1){
            out.write((char) nextChar);
            System.out.println((char)nextChar);
        }

        out.close();
    }
}

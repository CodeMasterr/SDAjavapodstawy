package JavaZaawansowana.dzien3.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("user.txt");
        FileOutputStream out = new FileOutputStream("user_output.txt");
        int c;
        while ((c = in.read()) != -1){
            out.write(c);
            System.out.println((char)c);
        }
    }
}

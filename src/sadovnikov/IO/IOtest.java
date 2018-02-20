package sadovnikov.IO;

import java.io.*;

public class IOtest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream  = System.in;
        OutputStream outputStream = System.out;
        int read = inputStream.read();
        int previous = read;
        if (read != -1) {
            do {
                read = inputStream.read();
                if (previous == 13 && read == 10) {
                    outputStream.write(10);
                    read = inputStream.read();
                    previous = read;
                } else {
                    outputStream.write(previous);
                    previous = read;
                }
            } while (read != -1);
            System.out.flush();
        }
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        // your implementation here
        int c = 0;
        int read = inputStream.read();
        while (read >= 0){

            c = Integer.rotateLeft(c,1)^read;
            read=inputStream.read();
        }
        return c;
    }
}

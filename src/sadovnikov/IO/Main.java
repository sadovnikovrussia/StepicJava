package sadovnikov.IO;

import java.io.IOException;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d;
        double sum = 0;
        while (scanner.hasNext()){
            if (scanner.hasNextDouble()){
                d = scanner.nextDouble();
                sum += d;
            } else {
                scanner.next();
            }
        }
        System.out.printf("%.6f", sum);

    }

    static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        int read = inputStreamReader.read();
        StringBuilder stringBuilder = new StringBuilder("");
        while (read != -1) {
            stringBuilder.append((char)read);
            read = inputStreamReader.read();
        }
        return stringBuilder.toString();
    }
}

package sadovnikov.Generic;

import java.util.ArrayList;
import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (scanner.hasNextInt()) {
            if (i % 2 != 0) {
                arrayList.add(scanner.nextInt());
            }
            i++;
        }
        for (int j = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(j) + " ");
        }


    }
}

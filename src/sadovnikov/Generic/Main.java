package sadovnikov.Generic;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> integers1 = new HashSet<>();
        Set<Integer> integers2 = new HashSet<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers2.add(1);
        integers2.add(2);
        integers2.add(4);
        Set<Integer> integers = symmetricDifference(integers1, integers2);
        System.out.println(integers);

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> ts1 = new HashSet<>(set1);
        Set<T> ts2 = new HashSet<>(set2);
        ts1.removeAll(set2);
        ts2.removeAll(set1);
        Set<T> tSet = new HashSet<>();
        tSet.addAll(ts1);
        tSet.addAll(ts2);
        return tSet;
    }


}


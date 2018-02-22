package sadovnikov.Generic;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Ternar {
    public static void main(String[] args) {
        DoubleStream doubleStream = DoubleStream.generate(Math::random).limit(10);
        boolean v = doubleStream.allMatch(value -> value > 0.5);
        System.out.println(v);
        System.out.println(Arrays.toString(pseudoRandomStream(13).toArray()));

    }

    public static IntStream pseudoRandomStream(int seed) {
        IntStream intStream = IntStream.iterate(seed, value -> value * value / 10 % 1000).limit(20);


        return intStream; // your implementation here
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}

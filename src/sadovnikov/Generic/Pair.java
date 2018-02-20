package sadovnikov.Generic;


import java.util.Objects;

public class Pair<I, S> {
    private I first;
    private S second;

    private Pair(I i, S s) {
        this.first = i;
        this.second = s;
    }

    public static <I, S> Pair<I, S> of(I i, S s) {
        return new Pair<>(i, s);
    }

    I getFirst() {
        return first;
    }

    S getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(getFirst(), pair.getFirst()) &&
                Objects.equals(getSecond(), pair.getSecond());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFirst(), getSecond());
    }
}

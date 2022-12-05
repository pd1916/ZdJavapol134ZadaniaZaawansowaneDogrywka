package pl.sdacademy.java.advanced.exercises.JavaZaawansowanaZadaniaBySDA.task27;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner<T> {
    private final String delimiter;

    public Joiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(T... parts) {
        return Stream.of(parts)
                .map(Object::toString)
                .collect(Collectors.joining(delimiter));
    }
}

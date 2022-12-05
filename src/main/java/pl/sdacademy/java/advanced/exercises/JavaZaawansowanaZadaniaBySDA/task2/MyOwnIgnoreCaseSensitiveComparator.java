package pl.sdacademy.java.advanced.exercises.JavaZaawansowanaZadaniaBySDA.task2;

import java.util.Comparator;

public class MyOwnIgnoreCaseSensitiveComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.toLowerCase().compareTo(o2.toLowerCase());
    }
}

package pl.sdacademy.java.advanced.exercises.additional.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    // A B Z D C -> Z D C B A
    public static List<String> sortUsingStream(List<String> unsorted) {
        return unsorted.stream()
                .sorted(Comparator.reverseOrder())
                //.toList();
                .collect(Collectors.toList());
    }

    public static List<String> sortUsingAnonymousClass(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2); // wynik mniejszy od 0 gdy o1 mniejsze od o2
            }
        });
        return sorted;
    }

    public static List<String> sortUsingOwnComparator(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }

    public static List<String> sortUsing(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }
}

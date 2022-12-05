package pl.sdacademy.java.advanced.exercises.additional.task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {
    private static final List<String> UNSORTED = List.of("A", "B", "Z", "D", "C");
    private static final List<String> EXPECTED_RESULT = List.of("Z", "D", "C", "B", "A");

    @Test
    void shouldReverseListOfStrings_UsingStream() {
        //when
        List<String> result = Task1.sortUsingStream(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT, result);
    }

    @Test
    void shouldReverseListOfStrings_UsingAnonymousClass() {
        //when
        List<String> result = Task1.sortUsingAnonymousClass(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT, result);
    }

    @Test
    void shouldReverseListOfStrings_UsingOwnComparator() {
        //when
        List<String> result = Task1.sortUsingOwnComparator(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT, result);
    }

}
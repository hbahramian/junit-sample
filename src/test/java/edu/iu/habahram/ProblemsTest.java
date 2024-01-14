package edu.iu.habahram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {

    @Test
    void problem1_Test1() {
        int[] numbers = {2, 7, 11, 15};
        var target = 9;
        int[] expected = {0, 1};

        var problems = new Problems();
        var output = problems.problem1(numbers, target);

        assertArrayEquals(expected, output);
    }

    @Test
    void problem1_Test2() {
        int[] numbers = {3, 2, 4};
        var target = 6;
        int[] expected = {1, 2};

        var problems = new Problems();
        var output = problems.problem1(numbers, target);

        assertArrayEquals(expected, output);
    }

    @Test
    void problem1_Test3() {
        int[] numbers = {3, 3};
        var target = 6;
        int[] expected = {0, 1};

        var problems = new Problems();
        var output = problems.problem1(numbers, target);

        assertArrayEquals(expected, output);
    }

    @Test
    void problem1_Test4() {
        int[] numbers = {3, 3};
        var target = 0;
        int[] expected = {-1, -1};

        var problems = new Problems();
        var output = problems.problem1(numbers, target);

        assertArrayEquals(expected, output);
    }

    @Test
    void problem1_Test5() {
        int[] numbers = {3};
        var target = 3;

        var problems = new Problems();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    problems.problem1(numbers, target);
                });
    }


}
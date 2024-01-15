package edu.iu.habahram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {

    @Test
    void problem1_Test1() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        Problems problems = new Problems();
        int[] output = problems.problem1(numbers, target);

        assertArrayEquals(expected, output);
    }

    @Test
    void problem1_Test2() {
        int[] numbers = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};

        Problems problems = new Problems();
        int[] output = problems.problem1(numbers, target);

        assertArrayEquals(expected, output);
    }

    @Test
    void problem1_Test3() {
        int[] numbers = {3, 3};
        int target = 6;
        int[] expected = {0, 1};

        Problems problems = new Problems();
        int[] output = problems.problem1(numbers, target);

        assertArrayEquals(expected, output);
    }

    @Test
    void problem1_Test4() {
        int[] numbers = {3, 3};
        int target = 0;
        int[] expected = {-1, -1};

        Problems problems = new Problems();
        int[] output = problems.problem1(numbers, target);

        assertArrayEquals(expected, output);
    }

    @Test
    void problem1_Test5() {
        int[] numbers = {3};
        int target = 3;

        Problems problems = new Problems();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    problems.problem1(numbers, target);
                });
    }


}
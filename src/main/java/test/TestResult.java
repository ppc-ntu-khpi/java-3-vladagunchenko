package test;

import domain.Exercise;
import java.util.Arrays;

public class TestResult {

    public static void main(String[] args) {

        int[] array = {5, 3, 8, 4, 2, 7, 1, 6};

        System.out.println("Original array: " + Arrays.toString(array));

        int[] sortedArray = Exercise.calculate(array);

        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }
}
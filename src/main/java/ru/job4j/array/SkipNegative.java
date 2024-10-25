package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int t = 0; t < array[i].length; t++) {
                if (array[i][t] < 0) {
                    array[i][t] = 0;
                }
            }
        }
        return array;
    }
}
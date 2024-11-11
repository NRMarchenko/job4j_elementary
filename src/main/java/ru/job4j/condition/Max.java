package ru.job4j.condition;

public class Max {
    private int a;
    private int b;
    private int c;

    public static int max(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }

    public static int max(int a, int b, int c) {
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        return max;
    }

    public static int max(int a, int b, int c, int d) {
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        max = (max > d) ? max : d;
        return max;
    }
}

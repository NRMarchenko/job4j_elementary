package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void when5and12Then12() {
        int a = 5;
        int b = 12;
        int expected = 12;
        double output = Max.max(a, b);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when5and12and8Then12() {
        int a = 5;
        int b = 12;
        int c = 8;
        int expected = 12;
        double output = Max.max(a, b, c);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when5and12and99and12Then99() {
        int a = 5;
        int b = 12;
        int c = 99;
        int d = 12;
        int expected = 99;
        double output = Max.max(a, b, c, d);
        assertThat(output).isEqualTo(expected);
    }
}
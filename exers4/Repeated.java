package ru.geekbrains.oop.core.exers4;

import org.junit.jupiter.api.RepeatedTest;

public class Repeated {
    @RepeatedTest(value = 5)
    public void checkSumCorrect() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Test
    public void checkSumException() {
        Assertions.assertEquals(3, 1 + 1);
    }
}

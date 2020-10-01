package ru.geekbrains.oop.core.exers4;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Timeout {
    @Test
    public void checkSumCorrect() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Timeout(value = 1500,unit = TimeUnit.MILLISECONDS)
    @Test
    public void checkSumException() throws InterruptedException {
        sleep(5000);
        Assertions.assertEquals(3, 1 + 1);
    }
}

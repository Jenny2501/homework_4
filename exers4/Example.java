package ru.geekbrains.oop.core.exers4;

public class Example {
    public class DisplayExample {

        @Test
        public void checkSumCorrect() {
            Assertions.assertEquals(2, 1 + 1);
        }

        @Disabled(value = "Отключен до 28 сентября")
        @Test
        public void checkSumException() {
            Assertions.assertEquals(4, 1 + 1);
        }
    }
}

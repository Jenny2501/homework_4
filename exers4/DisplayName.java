package ru.geekbrains.oop.core.exers4;

import org.junit.jupiter.api.Assertions;

@DisplayName("Авторизация");
public class DisplayName {
    @DisplayName("Корректный логин/пароль")
@Test
    public void ChecksumCorrect(){
        Assertions.assertEquals(2, 1+1);
    }
    @DisplayName("Корректный логин/пароль")
    @Test
    public void ChecksumException(){
        Assertions.assertEquals(3, 1+1);
    }

    @DisplayName("Логин заблокирован")
    @Test
    public void checkSumException() {
        Assertions.assertEquals(3, 1 + 1);
    }
}

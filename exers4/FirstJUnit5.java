package ru.geekbrains.oop.core.exers4;

import org.junit.jupiter.api.*;

public class FirstJUnit5 {

    @BeforeAll
    public void BeforeAll(){
        System.out.println("BeforeAll");
    }
    @BeforeEach
    public void BeforeEach(){
        System.out.println("BeforeEach");
    }

    @Test
    public void checksumException(){
        System.out.println("ChecksumException");
        Assertions.assertEquals(3, 1+1);
    }

    @Test
    public void checksumCorrect(){
        System.out.println("ChecksumCorrect");
        Assertions.assertEquals(2, 1+1);
    }
    @AfterEach
    public void AfterEach(){
        System.out.println("AfterEach");
    }
    @AfterAll
    public void AfterAll(){
        System.out.println("AfterAll");
    }

}

package ru.geekbrains.oop.core.exers4;

import java.awt.*;

public class StartTest {
    public class StartTest {

        @Test
        public void checkMethodTrace() {
            public void checkMethodTraceTest () {
                Cat catTim = new Cat("Tim", 11, 6);
                Cat catGarry = new Cat("Garry", 8, 4);
                Cat catMoris = new Cat("Moris", 14, 9);

                Runner humanMicle = new Human("Micle", 14, 4);
                Runner humanAlla = new Human("Alla", 11, 3);
                Runner humanRobert = new Human("Robert", 19, 5);

                Runner robotRally = new Robot("Rally", 14, 5);
                Runner robotEla = new Robot("Ela", 16, 16);
                Runner robotBendy = new Robot("Bendy", 17, 5);

                Runner[] runners = {catTim, catGarry, catMoris, humanMicle, humanAlla, humanRobert, robotRally, robotEla, robotBendy};

                Obstacles[] obstacles = {
                        new Wall(5),
                        new Wall(6),
                        new Treadmill(10),
                        new Wall(7),
                        new Treadmill(14),
                        new Treadmill(15),
                };
            }
        }
    }
}
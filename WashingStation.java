package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.Wiping;

public class WashingStation implements Washing {

    @Override
    public void wip(WashType washType) {
        switch (washType){
            case Mirrors -> System.out.println("Мойка зеркал");
            case Headlights -> System.out.println("Мойка фар");
            case Windshield -> System.out.println("Мойка стекол");
            case CarBody -> System.out.println("Мойка кузова");
        }
    }
}

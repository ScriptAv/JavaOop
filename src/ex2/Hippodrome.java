package ex2;

import ex2.Horse;

import java.util.Random;

/**
 * Created by script on 04.03.16.
 */
public class Hippodrome {
    public static void main(String[] args) {
        Horse[] horses = new Horse[10];

        Random random = new Random();

        for (int i = 0; i < horses.length; i++) {
            horses[i] = new Horse();
            horses[i].name = "Буцифал " + i;
        }

        for (Horse horse : horses) {
            horse.ride();
        }
    }
}
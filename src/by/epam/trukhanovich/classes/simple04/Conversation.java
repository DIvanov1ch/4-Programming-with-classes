package by.epam.trukhanovich.classes.simple04;

import java.util.Scanner;

public class Conversation {
    private final Train[] trains;

    public Conversation(Train[] trains) {
        this.trains = trains;
    }

    private static int readNumber(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println(message);
        }
        return scan.nextInt();
    }

    public void run() {
        int number;
        printAvailableTrains();
        number = readNumber("Enter train number: ");
        for (Train train : trains) {
            if (number == train.getTrainNumber()) {
                System.out.println(train);
                return;
            }
        }
        System.out.println("Incorrect number!\n");
        run();
    }

    public void printAvailableTrains() {
        new SortByNumber(trains).sort();
        System.out.println("Available train numbers: ");
        for (Train train : trains) {
            System.out.print(train.getTrainNumber() + ", ");
        }
        System.out.println();
    }
}

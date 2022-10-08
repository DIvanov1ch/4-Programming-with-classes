package by.epam.trukhanovich.classes.simple04;

/*
(4). Programming with classes
 Простейшие классы и объекты
 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте данные
 в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте
 возможность вывода информации о поезде,номер которого введен пользователем. Добавьте возможность сортировки массив
 по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
*/

import java.util.Arrays;

public class TrainDemo {

    public static void main(String[] args) {

        Train[] trains = new Train[]{
                new Train("Boston", 125, "11:25"),
                new Train("Chicago", 747, "10:03"),
                new Train("New York", 300, "12:00"),
                new Train("Sacramento", 501, "15:30"),
                new Train("New York", 303, "06:34"),
                new Train("Boston", 126, "21:05"),
                new Train("Chicago", 707, "11:53"),
                new Train("New York", 308, "06:00"),
                new Train("Sacramento", 505, "10:00"),
                new Train("New York", 305, "16:48")
        };

        Conversation conversation = new Conversation(trains);
        conversation.run();
        SortByDestination sortByDestination = new SortByDestination(trains);
        SortByDepartureTime sortByDepartureTime = new SortByDepartureTime(trains);
        sortByDestination.sort();
        System.out.println(Arrays.toString(trains));
        sortByDepartureTime.sort();
        System.out.println(Arrays.toString(trains));
    }
}

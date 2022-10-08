package by.epam.trukhanovich.classes.simple04;

/*
(4). Programming with classes
 Простейшие классы и объекты
 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте данные
 в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте
 возможность вывода информации о поезде,номер которого введен пользователем. Добавьте возможность сортировки массив
 по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
*/

public class Train {

    private final String destination;
    private final int trainNumber;
    private String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Train №" + trainNumber
                + " to " + destination
                + " leaves at " + departureTime;
    }
}

package by.epam.trukhanovich.classes.simple04;

public class SortByNumber implements Sortable{

    private final Train[] trains;

    public SortByNumber(Train[] trains) {
        this.trains = trains;
    }

    @Override
    public void sort() {
        Train temp;
        for (int i = 0; i < trains.length - 1; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[j - 1].getTrainNumber() > trains[j].getTrainNumber()) {
                    temp = trains[j];
                    trains[j] = trains[j - 1];
                    trains[j - 1] = temp;
                }
            }
        }
    }
}

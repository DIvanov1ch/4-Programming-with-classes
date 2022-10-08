package by.epam.trukhanovich.classes.simple04;

public class SortByDepartureTime implements Sortable{
    private final Train[] trains;

    public SortByDepartureTime(Train[] trains) {
        this.trains = trains;
    }

    @Override
    public void sort() {
        int[] parses = new int[trains.length];
        Train tempTrain;
        int tempInt;

        for (int i = 0; i < parses.length; i++) {
            parses[i] = Integer.parseInt(trains[i].getDepartureTime().replaceAll("\\D", ""));
        }

        for (int i = 0; i < trains.length - 1; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (parses[j] < parses[j - 1]) {

                    tempTrain = trains[j];
                    trains[j] = trains[j - 1];
                    trains[j - 1] = tempTrain;

                    tempInt = parses[j];
                    parses[j] = parses[j - 1];
                    parses[j - 1] = tempInt;
                }
            }
        }
    }
}

package by.epam.trukhanovich.classes.simple04;

public class SortByDestination implements Sortable{
    private final Train[] trains;

    public SortByDestination(Train[] trains) {
        this.trains = trains;
    }

    @Override
    public void sort() {
        Train temp;
        for (int i = 0; i < trains.length - 1; i++) {
            for (int j = trains.length - 1; j > i; j--) {

                if (trains[j].getDestination().compareTo(trains[j - 1].getDestination()) < 0) {
                    temp = trains[j];
                    trains[j] = trains[j - 1];
                    trains[j - 1] = temp;

                } else if (trains[j].getDestination().compareTo(trains[j - 1].getDestination()) == 0) {

                    int parse1 = Integer.parseInt(trains[j].
                            getDepartureTime().replaceAll("\\D", ""));
                    int parse2 = Integer.parseInt(trains[j - 1].
                            getDepartureTime().replaceAll("\\D", ""));

                    if (parse1 < parse2) {
                        temp = trains[j];
                        trains[j] = trains[j - 1];
                        trains[j - 1] = temp;
                    }
                }
            }
        }
    }
}

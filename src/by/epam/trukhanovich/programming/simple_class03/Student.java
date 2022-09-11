package by.epam.trukhanovich.programming.simple_class03;

import java.util.Arrays;

/*
 (4). Programming with classes
 Простейшие классы и объекты
 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти
 элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
 студентов, имеющих оценки, равные только 9 или 10.
*/

public class Student {

    private final String name;
    private String groupNumber;
    private int[] progress;
    private final static int NUMBER_OF_EXAMS = 5;

    public Student(String name, String groupNumber, int[] progress) {
        if (name == null || groupNumber == null || progress == null) {
            throw new IllegalArgumentException("Incorrect information");
        }
        if (name.isBlank() || groupNumber.isBlank()) {
            throw new IllegalArgumentException("Name or number of a group must not be empty");
        }

        this.name = name;
        this.groupNumber = groupNumber;
        this.progress = Arrays.copyOf(progress, NUMBER_OF_EXAMS);
    }

    public void setGroupNumber(String groupNumber) {
        if (groupNumber == null || groupNumber.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.groupNumber = groupNumber;
    }

    public void setProgress(int[] progress) {
        if (progress == null || progress.length == 0) {
            throw new IllegalArgumentException();
        }
        this.progress = Arrays.copyOf(progress, NUMBER_OF_EXAMS);
    }

    public int[] getProgress() {
        if (progress.length == 0) {
            System.out.println("Данные отсутствуют");
            this.progress = new int[NUMBER_OF_EXAMS];
        }
        return progress;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public String getName() {
        return name;
    }

    public boolean isBestStudent() {
        final int goodMark = 9;
        for (int j : this.progress) {
            if (j < goodMark) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", progress=" + Arrays.toString(progress) +
                '}';
    }
}

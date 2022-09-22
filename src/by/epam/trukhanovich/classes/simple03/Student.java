package by.epam.trukhanovich.classes.simple03;

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
        this.name = name;
        this.groupNumber = groupNumber;
        this.progress = Arrays.copyOf(progress, NUMBER_OF_EXAMS);
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setProgress(int[] progress) {
        this.progress = Arrays.copyOf(progress, NUMBER_OF_EXAMS);
    }

    public int[] getProgress() {
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

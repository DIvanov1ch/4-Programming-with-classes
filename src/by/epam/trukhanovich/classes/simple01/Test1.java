package by.epam.trukhanovich.classes.simple01;

/*
 (4). Programming with classes
 Простейшие классы и объекты
 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 Добавьте метод, который находит сумму значенйи этих переменных, и метод, который находит наибольшее значение
 из этих двух переменных
*/

public class Test1 {

    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber1(int number) {
        number1 = number;
    }

    public void setNumber2(int number) {
        number2 = number;
    }

    public int sum() {
        return Math.addExact(number1, number2);
    }

    public int getMax() {
        return Math.max(number1, number2);
    }

    @Override
    public String toString() {
        return "Test1{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}

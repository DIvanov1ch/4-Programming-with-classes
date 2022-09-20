package by.epam.trukhanovich.classes.simple02;

/*
 (4). Programming with classes
 Простейшие классы и объекты
 2. Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
 инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса
*/

public class Test2 {

    private String string;
    private double number;

    public Test2() {
    }

    public Test2(String string, double number) {
        this.string = string;
        this.number = number;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public double getNumber() {
        return number;
    }

}

package by.epam.trukhanovich.classes.simple02;

public class Test2Demo {

    public static void main(String[] args) {

        Test2 test1 = new Test2();
        Test2 test2 = new Test2("Ночь", 1001);

        test1.setNumber(2.0);
        test1.setString("Java");

        System.out.println("test1: " + test1.getNumber() + " " + test1.getString());
        System.out.println("test2: " + test2.getNumber() + " " + test2.getString());

    }
}



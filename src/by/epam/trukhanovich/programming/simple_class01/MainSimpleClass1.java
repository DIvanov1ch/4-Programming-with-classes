package by.epam.trukhanovich.programming.simple_class01;

public class MainSimpleClass1 {

    public static void main(String[] args) {

        Test1 test = new Test1();

        test.setNumber1(Integer.MIN_VALUE);
        test.setNumber2(-15);

        System.out.println("Наибольшее число: " + test.getMax());
        System.out.println(test);
        System.out.println(test.getNumber1());
        System.out.println(test.getNumber2());
        try {
            System.out.println("Сумма: " + test.sum());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

    }
}

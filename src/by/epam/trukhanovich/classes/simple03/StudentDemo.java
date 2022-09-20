package by.epam.trukhanovich.classes.simple03;

/*
 (4). Programming with classes
 Простейшие классы и объекты
 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти
 элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
 студентов, имеющих оценки, равные только 9 или 10.
*/

public class StudentDemo {

    public static void main(String[] args) {

        Student student1 = new Student("Иванов И.И.", "ТЭА-10", new int[]{4, 5, 5, 8, 7});
        Student student2 = new Student("Петров П.П.", "ТЭА-9", new int[]{8, 9, 5, 9, 6});
        Student student3 = new Student("Сидоров С.С.", "ТЭА-10", new int[]{10, 9, 9, 10, 9});
        Student student4 = new Student("Кузнецов А.А.", "ТМ-32", new int[]{7, 8, 8, 6, 4});
        Student student5 = new Student("Васильев В.В.", "АТПиП-4", new int[]{10, 6, 4, 6, 4});
        Student student6 = new Student("Соколов С.С.", "АТПиП-4", new int[]{5, 8, 5, 9, 4});
        Student student7 = new Student("Михайлов М.М.", "ТМ-32", new int[]{8, 4, 7, 10, 5});
        Student student8 = new Student("Егоров Е.Е.", "ТЭА-9", new int[]{5, 6, 7, 7, 5});
        Student student9 = new Student("Орлов О.О.", "МАПП-2-1", new int[]{10, 9, 9, 9, 10});
        Student student10 = new Student("Никитин Н.Н.", "МАПП-2-1", new int[]{6, 4, 5, 4, 5});

        Student[] students = new Student[]{
                student1, student2, student3, student4, student5, student6, student7, student8, student9, student10
        };

        System.out.println("Студенты-отличники: ");
        for (Student student : students) {
            if (student.isBestStudent()) {
                System.out.println(student.getName() + " " + student.getGroupNumber());
            }
        }

    }
}

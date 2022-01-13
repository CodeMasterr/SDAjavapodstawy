package JavaZaawansowana.dzien3.zadanie;

import JavaZaawansowana.dzien3.Student;

public class Main {
    public static void main(String[] args) {
        Uczelnia uw = new Uczelnia("Uniwersytet Warszawki");
        Uczelnia wat = new Uczelnia("Wojskowa Akademia Techniczna");

        Student student1 = new Student("Adam", "Kot", 1);
        Student student2 = new Student("Jan", "Nowak", 2);
        Student student3 = new Student("Maciej", "Kos", 3);
        Student student4 = new Student("Tomasz", "Lis", 2);

        uw.addStudent(student1);
        uw.addStudent(student2);
        uw.addStudent(student3);
        uw.addStudent(student4);

        uw.showStudents();
        System.out.println();
        uw.passStudent(student1);
        uw.showStudents();
        System.out.println();
        uw.removeStudent(3);
        uw.showStudents();
        System.out.println();
        uw.finishStudent(2);
        uw.showStudents();
        System.out.println();
    }
}

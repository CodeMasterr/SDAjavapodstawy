package JavaZaawansowana.dzien3.zadanie;

import JavaZaawansowana.dzien3.Student;

import java.util.HashMap;
import java.util.Map;

public class Uczelnia {
    String nazwa;
    static int index = 1;
    Map<Object,Student> mapaSt = new HashMap<>();

    public Uczelnia(String nazwa){
        this.nazwa = nazwa;
    }

    public void addStudent(Student student){
        this.mapaSt.put(getIndex(),student);
    }

    public void removeStudent(int index){
        this.mapaSt.remove(index);
    }

    public void finishStudent(int index){
        this.mapaSt.remove(index);
    }

    public void passStudent(Student student){
        student.promotionStudent();
        //this.mapaSt.replace(index,student);
    }

    public void showStudents(){
        for (Map.Entry<Object, Student> pair : this.mapaSt.entrySet()) {
            //System.out.println(mapaSt.get(pair).toString());

            System.out.println(pair);
        }
    }

    private static int getIndex(){
        index++;
        return (index-1);
    }



}

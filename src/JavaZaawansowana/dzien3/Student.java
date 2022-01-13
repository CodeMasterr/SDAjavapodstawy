package JavaZaawansowana.dzien3;

import java.util.Objects;

public class Student extends Object {

    String name;
    String surname;
    int rokStudiow;

    public Student(String name, String surname, int rokStudiow){
        this.name = name;
        this.surname =surname;
        this.rokStudiow = rokStudiow;
    }

    public void promotionStudent(){
        this.rokStudiow = this.rokStudiow+1;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,surname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", rokStudiow=" + rokStudiow +
                '}';
    }
}

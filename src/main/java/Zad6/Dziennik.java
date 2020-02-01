package Zad6;

import java.util.ArrayList;
import java.util.List;

public class Dziennik {
    private List<Student> studentList = new ArrayList<>();

    public void dodajStudenta(Student student) {
        studentList.add(student);
    }

    public void usunStudenta(Student student) {
        studentList.remove(student);
    }

//    todo: dalej piszemy metody
}

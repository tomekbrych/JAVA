//package Zad6;
//
//import javax.swing.text.html.Option;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.OptionalDouble;
//
//public class Dziennik {
//    private List<Student> studentList = new ArrayList<>();
//
//    public void dodajStudenta(Student student) {
//        studentList.add(student);
//    }
//
//    public void usunStudenta(Student student) {
//        studentList.remove(student);
//    }
//
//    public void usunStudentaIndeks(String index) {
//        for (Student student : studentList) {
//            if (student.getIndeks().equals(index)) {
//                studentList.remove(student);
//                break;
//            }
//        }
//    }
//
//    public Student zwrocStudenta(String index) {
//        for (Student student1 : studentList) {
//            if (student1.getIndeks().equals(index)) {
//                return student1;
//
//            }
//        }
//        return Optional.empty();
//
//    }
//
//    public Optional<Double> podajSredniaStudenta (String index) {
//        Optional<Student> studentOptional = zwrocStudenta(index);
//        if (studentOptional.isPresent()) {
//            Student student = studentOptional.get();
//
//            return student.obliczSrednia();
//        }
//
//        }
//}
//
//
////    todo: dalej piszemy metody
//}

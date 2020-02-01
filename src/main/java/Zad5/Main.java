package Zad5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studenci = new ArrayList<>();

        Student marek = new Student("12345", "Marek", "Jakis", Plec.MEZCZYZNA );
        Student mirek = new Student("6543", "Mirek", "Taki", Plec.MEZCZYZNA );
        Student irma = new Student("236346", "Irma", "Samosia", Plec.KOBIETA );

        studenci.add(marek);
        studenci.add(mirek);
        studenci.add(irma);

        System.out.println(studenci);

        for (Student lista:studenci
             ) {
            System.out.println(lista);
        }

        System.out.println();
        for (Student student: studenci) {
            System.out.println(student);
        }

        System.out.println();
        for (Student student: studenci) {
            if(student.getPlec() == Plec.KOBIETA) {
                System.out.println("To jest kobieta:" + student);
            }
        }

        System.out.println();
        for (Student indeksy: studenci
             ) {
            System.out.println(indeksy.getIndeks());

        }

        }

    }


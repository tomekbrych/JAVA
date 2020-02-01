package Zad5;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
@ToString
@Getter
@Setter
public class Student {

        private String indeks;
        private String imie;
        private String nazwisko;
        private Plec plec;

    public Student(String indeks, String imie, String nazwisko, Plec plec) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }
}
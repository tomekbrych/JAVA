package Zad6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Student {
    private String indeks;
    private String imie;
    private String nazwisko;
    private List<Double> oceny;

    public Student(String indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = new ArrayList<>();
    }

    public void dodajOcene(Double ocena){
        this.oceny.add(ocena);
    }
}

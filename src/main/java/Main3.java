import java.util.ArrayList;
import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>(Arrays.asList( "10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355",
                "2222", "1111", "3546", "138751", "235912"));

        System.out.println(lista.indexOf("138751"));

        if (lista.contains("67888") || lista.contains("67889")) {
            System.out.println("Obiekt znajduje się na liście.");
        } else {
            System.out.println("Obiektu nie ma na liście.");
        }

        lista.remove("67889");
        lista.remove("67888");

        for (String listacala:lista
             ) {
            System.out.print(listacala +",");

        }

        System.out.println();
        if (lista.contains("67888") || lista.contains("67889")) {
            System.out.println("Obiekt znajduje się na liście.");
        } else {
            System.out.println("Obiektu nie ma na liście.");
        }

        for (String calalista:lista
             ) {
            System.out.println(calalista);

        }

        for (String calalista:lista
             ) {
            System.out.print(calalista + ",");

        }

        }


    }


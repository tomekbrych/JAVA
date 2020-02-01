package Zad2;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int liczbz=0;
        int i;

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < 10 ; j++) {
            list.add(random.nextInt(10));
        }


        System.out.println(list.toString());

        for (i = 0; i < list.size(); i++) {
             liczbz = list.get(i);
        sum = sum+liczbz;
        }

        System.out.println(sum);

        List<Integer> kopia = new ArrayList<>(list);

        Collections.sort(list);

        double srednia = 0;
        double mediana = 0.0;

        if (list.size() % 2 == 0 )
        {
            srednia = list.get(list.size() / 2) + list.get((list.size() / 2) - 1);
            mediana = srednia/2.0;
        }
        else
        {
            mediana = list.get(list.size() / 2);
        }
        System.out.println(mediana);
        System.out.println(srednia);

        

    }
}

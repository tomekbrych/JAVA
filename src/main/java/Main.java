import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<5; i++) {
            list.add(scanner.nextInt());
        }

        for (int i=0; i<5; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

    }
}

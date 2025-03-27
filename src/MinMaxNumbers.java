import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// program koji ucitava 6 prirodnih brojeva i ispisuje najmanji i najveci medu njima
public class MinMaxNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Unesi 6 prirodnih brojeva:");

        for (int i = 0; i < 6; i++) {
            int number = input.nextInt();
            numbers.add(number);
        }

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("Najmanji broj: " + min);
        System.out.println("Najveci broj: " + max);
    }
}

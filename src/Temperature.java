import java.util.Scanner;

// program koji ucitava temperaturu u Celzijusima i ispisuje je u Farenheitima i Kelvinima
public class Temperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Temperatura u C:");

        double celsius = input.nextDouble();

        double tempFaranheit = celsius * 9 / 5 + 32;
        System.out.println("Temperatura u F: " + tempFaranheit);

        double tempKelvin = celsius + 273.15;
        System.out.println("Temperatura u K: " + tempKelvin);

        input.close();
    }
}

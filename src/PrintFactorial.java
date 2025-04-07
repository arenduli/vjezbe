import java.util.Scanner;

// ispisi faktorijelu nekog broja (umnozak tog broja sa svim pozitivnim cijelim prethodnim brojevima)
public class PrintFactorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi broj za koji zelis faktorijelu:");

        int number = input.nextInt();
        long factorial = calculateFactorial(number);

        System.out.println("Factorial is:  " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

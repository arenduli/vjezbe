// program koji ispisuje prvih 100 prirodnih brojeva, od kojih za brojeve djeljive s 3 ispisuje "Fizz",
// za brojeve djeljive s 5 ispisuje "Buzz", a za brojeve djeljive s 3 i 5 ispisuje "FizzBuzz"

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

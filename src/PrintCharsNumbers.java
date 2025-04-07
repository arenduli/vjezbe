import java.util.Scanner;

// program koji ucitava ulazni niz znakova i ispisuje koliko ima slova, brojeva i ostalih znakova u tom nizu
public class PrintCharsNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi niz znakova:");

        String inputLetters = input.nextLine();
        int letterCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for (int i = 0; i < inputLetters.length(); i++) {
            char ch = inputLetters.charAt(i);
            if (Character.isAlphabetic(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (ch != ' ') {
                otherCount++;
            }
        }

        System.out.println("Slova: " + letterCount);
        System.out.println("Brojeva: " + digitCount);
        System.out.println("Ostali znakovi: " + otherCount);
    }
}

import java.util.Scanner;

// program koji provjerava da li je uneseni OIB valjan
public class OibValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi OIB:");
        String oib = input.nextLine();

        if (isValidOib(oib)) {
            System.out.println("OIB je valjan.");
        } else {
            System.out.println("OIB nije valjan.");
        }

        input.close();
    }

    public static boolean isValidOib(String oib) {
        if (oib.length() != 11 || !oib.matches("\\d{11}")) {
            return false;
        }

        int checkDigit = calculateCheckDigit(oib.substring(0, 10));
        return checkDigit == Character.getNumericValue(oib.charAt(10));
    }

    private static int calculateCheckDigit(String oib) {
        int remainder = 10;
        for (int i = 0; i < oib.length(); i++) {
            int digit = Character.getNumericValue(oib.charAt(i));
            remainder = (remainder + digit) % 10;
            if (remainder == 0) {
                remainder = 10;
            }
            remainder = (remainder * 2) % 11;
        }
        int checkDigit = 11 - remainder;
        if (checkDigit == 10) {
            checkDigit = 0;
        }
        return checkDigit;
    }
}

import java.util.Scanner;

// program koji ispisuje iznos u eurima u razlicitim apoenima novcanica
public class PrintEurInBills {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi iznos u EUR:");
        String amount = input.nextLine();

        double[] bills = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        double amountInEur = Double.parseDouble(amount);

        for (double bill : bills) {
            int count = (int) (amountInEur / bill);

            if (count > 0) {
                System.out.println(bill + " x " + count);
                amountInEur = amountInEur - (count * bill);
            }
        }
    }
}

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int a;  // Armstrongov broj
        int b;  // svaki broj

        for (int i = 1; i < 10000; i++) {

            int sum = 0;
            a = i;

            if(a > 0) {
                b = a % 10;
                sum = sum + (b * b * b);
                System.out.println(sum);
            }
        }
    }
}

// program koji ispisuje sve Armstrongove brojeve (= sumi kubova svojih znamenaka) manje od 10000

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int a;
        int b;

        for (int i = 0; i < 10000; i++) {

            int sum = 0;
            a = i;

            while(a > 0) {
                b = a % 10;
                sum = sum + (b * b * b);
                a = a /10;
            }

            if(sum == i) {
                System.out.println(i);
            }

        }
    }
}

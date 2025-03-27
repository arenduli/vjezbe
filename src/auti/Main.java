package auti;

public class Main {

    public static void main(String[] args) {

        Auto crveniAuto = new Auto("crveni", 4, 5, 4);

        System.out.println(crveniAuto.boja);
        System.out.println(crveniAuto.snaga);

        if (crveniAuto instanceof  Auto) {    // nasljeduje
            crveniAuto.setBoja("plavi");
            System.out.println("Ovo je auto");
        }

        System.out.println(crveniAuto.voziti(2));
    }
}

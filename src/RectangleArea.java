import java.util.Scanner;

// program koji ucitava duljinu i sirinu pravokutnika u konzolu i ispisuje njegovu povrsinu
public class RectangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Duljina pravokutnika:");
        double length = input.nextDouble();

        System.out.println("Sirina pravokutnika:");
        double width = input.nextDouble();

        System.out.println("Povrsina pravokutnika:");
        System.out.println(length * width);

        input.close();
    }
}

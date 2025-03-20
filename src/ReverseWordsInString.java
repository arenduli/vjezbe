// program koji ucitava ulazni string i okrene redoslijed rijeci u tom stringu

public class ReverseWordsInString {

    public static void main(String[] args) {

        String initialString = "Danas je cetvrtak";

        System.out.println("Pocetna recenica:");
        System.out.println(initialString);

        String[] words = initialString.split("\\s+");

//        for (String word : words) {
//            System.out.println(word);
//        }

        System.out.println("Okrenuti redoslijed rijeci u recenici:");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]);
            if (i > 0) {
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
}

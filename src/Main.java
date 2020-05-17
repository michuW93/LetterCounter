import java.util.*;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int numberOfLines = in.nextInt();
        in.nextLine();
        String text = "";
        for (int i = 0; i < numberOfLines; i++) {
            text += in.nextLine();
        }
        countLetters(text.replace(" ", ""));
    }

    private static void countLetters(String text) {
        Map<Character, Integer> lettersCounter = new TreeMap<>();
        for (int indexOfLetter = 0; indexOfLetter < text.length(); indexOfLetter++) {
            if (lettersCounter.get(text.charAt(indexOfLetter)) != null) {
                lettersCounter.put(text.charAt(indexOfLetter), lettersCounter.get(text.charAt(indexOfLetter)) + 1);
            } else {
                lettersCounter.put(text.charAt(indexOfLetter), 1);
            }
        }
        printSmallLetters(lettersCounter);
        printCapitalLetters(lettersCounter);
    }

    private static void printCapitalLetters(Map<Character, Integer> lettersCounter) {
        for (Character entry : lettersCounter.keySet()) {
            if (isUpperCase(entry))
                System.out.println(entry + " " + lettersCounter.get(entry));
        }
    }

    private static void printSmallLetters(Map<Character, Integer> lettersCounter) {
        for (Character entry : lettersCounter.keySet()) {
            if (isLowerCase(entry))
                System.out.println(entry + " " + lettersCounter.get(entry));
        }
    }

}
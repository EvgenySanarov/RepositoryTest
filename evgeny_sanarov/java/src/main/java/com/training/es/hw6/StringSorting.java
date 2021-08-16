package com.training.es.hw6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringSorting {
    private static final String INPUT_TEXT = "Once upon a time a Wolf was lapping at a spring " +
            "on a hillside, when, looking up,, what should he321 see but a Lamb just 123 " +
            "beginning to drink " +
            "a little lower down";

    public static void main(String[] args) {
        String formattedText = INPUT_TEXT.replaceAll("\\W+", " ").replaceAll("\\d+", " ").toLowerCase();
        Set<String> set = new HashSet<>(Arrays.asList(formattedText.split("\\s")));
        set.remove("");
        String[] words = set.toArray(new String[0]);
        Arrays.sort(words);

        String upperLetter = "";
        for (String word : words) {
            String currentUp = String.valueOf(word.charAt(0));
            if (!currentUp.equals(upperLetter)) {
                System.out.print("\n" + word.toUpperCase().charAt(0) + ": ");
            }

            System.out.print(word + " ");
            upperLetter = currentUp;
        }
    }
}
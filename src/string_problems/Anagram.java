package string_problems;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    /**
     * INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     * <p>
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     * original letters exactly once.
     * <p>
     * Ex: "CAT" & "ACT",
     * "ARMY" & "MARY",
     * "FART" & "RAFT"
     */

    // Implement Here
    public static void main(String[] args) {

        String word1 = "Cat";
        String word2 = "Act";

        // lower character
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // check if length is same

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        // sort the char Array

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        // is string anagram true or false

        boolean result = Arrays.equals(charArray1, charArray2);

        if (result) {
            System.out.println(word1 + " and " + word2 + " are anagram. ");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagram. ");

        }


    }

}


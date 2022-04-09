package string_problems;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    /**
     * INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here
        Map<String, Integer> hashMap = new HashMap<>();

        int count;

        // convert String st to upper case
        st = st.toUpperCase();

        // split the String into words and storing the in an array

        String words[] = st.split(" ");

        for (int i = 0; i < words.length; i++) {
            count = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }


            if (count > 1 && words[i] != "0")
                System.out.println("Duplicate words given in this String is: " + words[i]);


        }

//        for (String word: words){
//
//            Integer integer = hashMap.get(word);
//
//            if (integer == null)
//                hashMap.put(word, 1);
//
//            else {
//
//                hashMap.put(word, integer + 1);
//            }
//        }
//        System.out.println(hashMap);
//
//        }

    }

}



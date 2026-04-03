package Multibank_Assessment.Main;

import java.util.*;
import java.util.stream.*;
import static Multibank_Assessment.Data.Dataset.*;


public class CharacterCounter {
    public static String countCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .collect(Collectors.joining(", "));
    }

    public static String alphabetsOnlyCountCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String word = input.replaceAll("[^a-zA-Z]", "");
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char c : word.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .collect(Collectors.joining(", "));
    }

    static void main(String[] args) {
        System.out.println("Input: " + WORD);
        System.out.println("Output: " + countCharacters(WORD));
        System.out.println("Output: " + alphabetsOnlyCountCharacters(WORD));
    }
}

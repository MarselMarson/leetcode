package org.example.hashMap;

import java.util.Map;
import java.util.stream.Collectors;

public class Task383RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aaa", "aaa"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Long> lettersCount = ransomNote.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        int foundedCount = 0;

        for (int i = 0; i < magazine.length() && foundedCount < ransomNote.length(); i++) {
            char ch = magazine.charAt(i);
            if (lettersCount.containsKey(ch) && lettersCount.get(ch) != 0) {
                foundedCount++;
                lettersCount.compute(ch, (k, v) -> v - 1);
            }
        }

        return foundedCount == ransomNote.length();
    }
}

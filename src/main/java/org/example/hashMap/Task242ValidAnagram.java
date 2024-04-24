package org.example.hashMap;

import java.util.Map;
import java.util.stream.Collectors;

public class Task242ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Long> charCount = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (!charCount.containsKey(ch)) {
                return false;
            }

            long count = charCount.computeIfPresent(ch, (k, v) -> v - 1);
            if (count == 0) {
                charCount.remove(ch);
            }
        }

        return true;
    }
}
